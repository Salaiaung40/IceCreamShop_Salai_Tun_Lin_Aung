package be.intecbrussel.sellers;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {
    private final PriceList priceList;
    private double totalProfit;
    private double totalPrice; // extra calculation for the total order price


    //Constructor
    public IceCreamSalon(PriceList priceList) {

        this.priceList = priceList;
        this.totalProfit = 0;
        this.totalPrice=0;
    }


    //Setter
    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    //Getter
    public double getTotalProfit() {
        return totalProfit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        totalPrice += (balls.length * priceList.getBallPrice());
        totalProfit =  totalPrice * 0.35;
//        totalProfit += (balls.length * priceList.getBallPrice()) * 0.35;
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalPrice += (priceList.getRocketPrice());
        totalProfit = totalPrice * 0.35;

        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType name) {
        totalPrice += (priceList.getMagnumPrice(name));
        totalProfit = totalPrice * 0.35;

        return new Magnum(name);
    }


    @Override
    public String toString() {
        return "\nIceCreamSalon " +
                "\npriceList = " + "IceCream Ball $" + priceList.getBallPrice() +
                ", Ice Rocket $" + priceList.getRocketPrice() +
                ", Magnum Standard $" + priceList.getMagnumStandardPrice() +
                ", \nTotalProfit = $ " + totalProfit ;
    }
}
