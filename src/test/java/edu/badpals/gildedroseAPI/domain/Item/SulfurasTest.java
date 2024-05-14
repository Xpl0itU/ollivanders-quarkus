package edu.badpals.gildedroseAPI.domain.Item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    @Test
    public void qualityRemainsEightyAfterUpdate() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras", 5, 10);
        sulfuras.updateItem();
        assertEquals(80, sulfuras.getQuality());
    }

    @Test
    public void sellInRemainsUnchangedAfterUpdate() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras", 5, 10);
        sulfuras.updateItem();
        assertEquals(5, sulfuras.getSellIn());
    }

    @Test
    public void qualityRemainsEightyWhenQualityIsZero() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras", 5, 0);
        sulfuras.updateItem();
        assertEquals(80, sulfuras.getQuality());
    }

    @Test
    public void qualityRemainsEightyWhenQualityIsEighty() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras", 5, 80);
        sulfuras.updateItem();
        assertEquals(80, sulfuras.getQuality());
    }

    @Test
    public void sellInRemainsNegativeAfterUpdate() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras", -1, 10);
        sulfuras.updateItem();
        assertEquals(-1, sulfuras.getSellIn());
    }
}