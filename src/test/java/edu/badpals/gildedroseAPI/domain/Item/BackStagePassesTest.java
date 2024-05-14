package edu.badpals.gildedroseAPI.domain.Item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackStagePassesTest {

    @Test
    public void qualityIncreasesByOneWhenSellInIsMoreThanTen() {
        BackStagePasses backStagePasses = new BackStagePasses("Backstage passes", 11, 10);
        backStagePasses.updateItem();
        assertEquals(11, backStagePasses.getQuality());
    }

    @Test
    public void qualityIncreasesByTwoWhenSellInIsTenOrLessButMoreThanFive() {
        BackStagePasses backStagePasses = new BackStagePasses("Backstage passes", 10, 10);
        backStagePasses.updateItem();
        assertEquals(12, backStagePasses.getQuality());
    }

    @Test
    public void qualityIncreasesByThreeWhenSellInIsFiveOrLessButNotNegative() {
        BackStagePasses backStagePasses = new BackStagePasses("Backstage passes", 5, 10);
        backStagePasses.updateItem();
        assertEquals(13, backStagePasses.getQuality());
    }

    @Test
    public void qualityDropsToZeroWhenSellInIsNegative() {
        BackStagePasses backStagePasses = new BackStagePasses("Backstage passes", 0, 10);
        backStagePasses.updateItem();
        assertEquals(0, backStagePasses.getQuality());
    }

    @Test
    public void sellInDecreasesByOneAfterUpdate() {
        BackStagePasses backStagePasses = new BackStagePasses("Backstage passes", 5, 10);
        backStagePasses.updateItem();
        assertEquals(4, backStagePasses.getSellIn());
    }

    @Test
    public void qualityDoesNotExceedFifty() {
        BackStagePasses backStagePasses = new BackStagePasses("Backstage passes", 5, 49);
        backStagePasses.updateItem();
        assertEquals(50, backStagePasses.getQuality());
    }
}