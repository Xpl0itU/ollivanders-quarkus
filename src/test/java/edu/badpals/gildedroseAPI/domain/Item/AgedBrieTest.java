package edu.badpals.gildedroseAPI.domain.Item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
    @Test
    public void qualityRemainsUnchangedWhenQualityIsFifty() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", 5, 50);
        agedBrie.updateItem();
        assertEquals(50, agedBrie.getQuality());
    }

    @Test
    public void qualityIncreasesByTwoWhenSellInIsZero() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", 0, 10);
        agedBrie.updateItem();
        assertEquals(12, agedBrie.getQuality());
    }

    @Test
    public void qualityIncreasesByTwoWhenSellInIsNegative() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", -1, 10);
        agedBrie.updateItem();
        assertEquals(12, agedBrie.getQuality());
    }

    @Test
    public void sellInBecomesNegativeAfterUpdate() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", 0, 10);
        agedBrie.updateItem();
        assertEquals(-1, agedBrie.getSellIn());
    }

    @Test
    public void qualityIncreasesByOneWhenQualityIsZeroAndSellInIsPositive() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", 5, 0);
        agedBrie.updateItem();
        assertEquals(1, agedBrie.getQuality());
    }
}