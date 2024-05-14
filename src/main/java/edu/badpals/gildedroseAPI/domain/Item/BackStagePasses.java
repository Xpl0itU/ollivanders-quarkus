package edu.badpals.gildedroseAPI.domain.Item;

public class BackStagePasses extends Item{
    public BackStagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void updateItem() {
        updateSellIn();
        updateQuality();
    }
    @Override
    public void updateQuality(){
        if (sellIn >= 10 && checkQuality()){
            quality = Math.min(quality + 1, 50);
            return;
        }
        if(sellIn < 10 && sellIn > 5 && checkQuality()){
            quality = Math.min(quality + 2, 50);
            return;
        }
        if (sellIn <= 5 && sellIn > 0 && checkQuality()){
            quality = Math.min(quality + 3, 50);
            return;
        }
        quality = 0;
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
