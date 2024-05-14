package edu.badpals.gildedroseAPI.domain.Item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {

    @Test
    public void qualityDecreasesByOneWhenSellInIsPositive() {
        NormalItem normalItem = new NormalItem("Normal Item", 5, 10);
        normalItem.updateItem();
        assertEquals(9, normalItem.getQuality());
    }

    @Test
    public void qualityDecreasesByTwoWhenSellInIsZeroOrNegative() {
        NormalItem normalItem = new NormalItem("Normal Item", 0, 10);
        normalItem.updateItem();
        assertEquals(8, normalItem.getQuality());
    }

    @Test
    public void qualityDoesNotGoBelowZero() {
        NormalItem normalItem = new NormalItem("Normal Item", 0, 1);
        normalItem.updateItem();
        assertEquals(0, normalItem.getQuality());
    }

    @Test
    public void sellInDecreasesByOneAfterUpdate() {
        NormalItem normalItem = new NormalItem("Normal Item", 5, 10);
        normalItem.updateItem();
        assertEquals(4, normalItem.getSellIn());
    }

    @Test
    public void qualityRemainsZeroWhenQualityIsZero() {
        NormalItem normalItem = new NormalItem("Normal Item", 5, 0);
        normalItem.updateItem();
        assertEquals(0, normalItem.getQuality());
    }
}