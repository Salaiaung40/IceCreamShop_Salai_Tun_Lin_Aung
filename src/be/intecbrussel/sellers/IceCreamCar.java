package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    //Create function and declare
    private PriceList pricelist;
    private Stock stock;
    private double profit;
    private double totalPrice; // extra calculation for the total order price


    //Constructor

    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    //Order Cone
    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        this.prepareCone(balls);
        return new Cone(balls);
    }

    // Prepare Cone
    private Cone prepareCone(Cone.Flavor[] balls) throws NoMoreIceCreamException{

        int countCones = 0;

        if (stock.getCones() <= 0 || stock.getBalls() <= 0) {
            try {
                throw new NoMoreIceCreamException("No more Balls or Cones");
            } catch (NoMoreIceCreamException e) {
                System.out.println("No more Balls or Cones ..!!");
            }

        } else {
            for (int i = 0; i < balls.length; i++) {
                stock.setBalls(stock.getBalls() - balls.length);
                totalPrice += pricelist.getBallPrice();
                profit = totalPrice * 0.5;
            }
            System.out.println("Preparing your Balls on a cone");
            countCones++;
            stock.setCones(stock.getCones() - countCones);
        }
        return new Cone(balls);
    }

    //Order IceRocket
    @Override
    public IceRocket orderIceRocket() {
        this.prepareIceRocket();
        return new IceRocket();

    }

    // Prepare IceRockets
    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {

        int countIceRocket = 0;
        if (stock.getIceRockets() <= 0) {
            try {
                throw new NoMoreIceCreamException("No more IceRocket");
            } catch (NoMoreIceCreamException e) {
                System.out.println("No more IceRocket ...!!");
            }

        } else {
            int inStock = stock.getIceRockets();
            inStock -= 1;
            totalPrice += pricelist.getRocketPrice();
            profit = totalPrice * 0.5;

            System.out.println("Preparing your IceRocket");
            countIceRocket++;
            stock.setIceRockets(stock.getIceRockets() - countIceRocket);

        }
//        return countIceRocket;
        return new IceRocket();
    }


    //Order Magnum
    @Override
    public Magnum orderMagnum(Magnum.MagnumType name) {
        this.prepareMagnum(name);
        return new Magnum(name);
    }

    //Prepare Magnum
    private Magnum prepareMagnum(Magnum.MagnumType name) {

        int countMagnum = 0;

        if (stock.getMagni() <= 0) {
            try {
                throw new NoMoreIceCreamException("No more Magnum");
            } catch (NoMoreIceCreamException e) {
                System.out.println("No more Magnum ..!!!!");
            }

        } else {

            int inStock = stock.getMagni();
            inStock -= 1;
            totalPrice += pricelist.getMagnumPrice(name);
            profit = totalPrice * 0.5;
            System.out.println("Your Magnum is processing");
            countMagnum++;
            stock.setMagni(stock.getMagni() - countMagnum);
        }
        return new Magnum();
    }

    // Profit
    public double getProfit() {
        return profit;
    }

    // Create Exception inner class


    public class NoMoreIceCreamException extends RuntimeException {
        public NoMoreIceCreamException(String message) {
            super(message);

        }
        public NoMoreIceCreamException(String message, Throwable cause){
            super(message, cause);
        }

        public NoMoreIceCreamException(Throwable cause){
            super(cause);
        }

    }

}
