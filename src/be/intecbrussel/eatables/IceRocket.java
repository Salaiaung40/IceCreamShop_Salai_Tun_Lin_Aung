package be.intecbrussel.eatables;

import be.intecbrussel.sellers.PriceList;

public class IceRocket implements Eatable {
    PriceList priceListIceRocket;
     public IceRocket() {
    }
    @Override
    public void eat() {
        System.out.println("Your Order - Ice-Rocket");

    }
}
