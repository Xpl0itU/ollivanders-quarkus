package edu.badpals.gildedroseAPI.domain.Item;


public class NormalItem extends Item{
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void updateItem() {
        updateSellIn();
        updateQuality();
    }
    @Override
    public void updateQuality(){
        if (sellIn > 0 && checkQuality()){
            quality = Math.max(quality - 1, 0);
            return;
        }
        quality = Math.max(quality - 2, 0);
    }

    @Override
    public void updateSellIn(){
        --sellIn;
    }

    private boolean checkQuality(){
        return quality <= 50 && quality >= 0;
    }
    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}

