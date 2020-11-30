package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {
    private final PriceList priceList;
    private double totalProfit;


    //Getter
//    public double getTotalProfit() {
//        return totalProfit; // need to add the code
//    }

    //Don't forget to create a constructor to which you can add a PriceList.

    public IceCreamSalon(PriceList priceList) {

        this.priceList = priceList;
        this.totalProfit = 0;
    }

    //Methods
    @Override
    public double getProfit() {

        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    public double getTotalProfit() {
        return totalProfit;
    }


//    @Override
//    public Cone orderCone(String Flavor) {
//        // Create and return new cone base on array of flavours and
//        // also use the price-list to increase tje total profit.
//        return null;
//    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
//        double coneCost = balls.length * priceList.getBallPrice();
//        totalProfit += coneCost/3;
        totalProfit += (balls.length * priceList.getBallPrice())/3;
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() {
        // Create and return a new ice-rocket.
        // It will also use the price-list to increase the total profit value.
        totalProfit += (priceList.getRocketPrice())/3;
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType name) {

        //create and return a new Magnum based on a MagnumType.
        // It will also use the price-list to increase the total profit value.
        totalProfit+= (priceList.getMagnumPrice(name))/3;
        return new Magnum(name);
    }


    @Override
    public String toString() {
        return "IceCreamSalon " +
                "\npriceList = " + priceList +
                ", \nTotalProfit = $ " + totalProfit ;
    }
}
