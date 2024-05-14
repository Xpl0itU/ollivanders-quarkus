package edu.badpals.gildedroseAPI.domain.Item;

public class Sulfuras extends Item{
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void updateItem() {
        updateSellIn();
        updateQuality();
    }
    @Override
    public void updateQuality(){
        quality = 80;
    }

    @Override
    public void updateSellIn(){
        return;
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}
