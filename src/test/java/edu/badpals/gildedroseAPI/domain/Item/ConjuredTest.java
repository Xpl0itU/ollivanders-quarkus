package edu.badpals.gildedroseAPI.domain.Item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredTest {

    @Test
    public void qualityDecreasesByTwoWhenSellInIsPositive() {
        Conjured conjured = new Conjured("Conjured", 5, 10);
        conjured.updateItem();
        assertEquals(8, conjured.getQuality());
    }

    @Test
    public void qualityDecreasesByFourWhenSellInIsZero() {
        Conjured conjured = new Conjured("Conjured", 0, 10);
        conjured.updateItem();
        assertEquals(6, conjured.getQuality());
    }

    @Test
    public void qualityDecreasesByFourWhenSellInIsNegative() {
        Conjured conjured = new Conjured("Conjured", -1, 8);
        conjured.updateItem();
        assertEquals(4, conjured.getQuality());
    }

    @Test
    public void qualityDoesNotGoBelowZero() {
        Conjured conjured = new Conjured("Conjured", 0, 1);
        conjured.updateItem();
        assertEquals(0, conjured.getQuality());
    }

    @Test
    public void sellInDecreasesByOneAfterUpdate() {
        Conjured conjured = new Conjured("Conjured", 5, 10);
        conjured.updateItem();
        assertEquals(4, conjured.getSellIn());
    }

    @Test
    public void qualityRemainsZeroWhenQualityIsZero() {
        Conjured conjured = new Conjured("Conjured", 5, 0);
        conjured.updateItem();
        assertEquals(0, conjured.getQuality());
    }
}