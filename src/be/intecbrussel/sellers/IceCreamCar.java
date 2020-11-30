package be.intecbrussel.sellers;

import be.intecbrussel.application.IceCreamAppV1;
import be.intecbrussel.application.IceCreamAppV2;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    //Create function and declare
//    PriceList pricelist = new PriceList();
//    Stock stock = new Stock();
    private PriceList pricelist;
    private Stock stock;
    Cone cone;
    private double profit;


    //Constructor

    public IceCreamCar() {

    }

    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }


    // Create Methods
    public class NoMoreIceCreamException extends Throwable {
        public NoMoreIceCreamException(String no_more_balls_or_cones) {
        }
    }

    //Order Cone
    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        this.prepareCone(balls);
        return new Cone(balls);
    }

   // Prepare Cone
    private Cone prepareCone(Cone.Flavor[] balls)  {

        int countCones = 1;

        if (stock.getCones() < 0 || stock.getBalls() < 0) {
            try {
                throw new NoMoreIceCreamException("No more Balls or Cones");
            } catch (NoMoreIceCreamException e) {
                e.printStackTrace();
            }
//            System.out.println("No more Balls or Cones"); // need to update the message
        } else {
            for (int i = 0; i < balls.length; i++) {
                stock.setBalls(stock.getBalls() - balls.length);
                profit += (pricelist.getBallPrice())/3;
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
    private IceRocket prepareIceRocket() {

        int countIceRocket = 1;

        if (stock.getIceRockets() < 0) {
            try {
                throw new NoMoreIceCreamException("No more IceRocket");
            } catch (NoMoreIceCreamException e) {
                e.printStackTrace();
            }
//            System.out.println("No more IceRocket"); // need to update the message
        } else {
            for (int i = 0; i < stock.getIceRockets(); i++) {
                stock.setIceRockets(stock.getIceRockets() - stock.getIceRockets());
                profit += (pricelist.getRocketPrice())/3;
            }
            System.out.println("Preparing your IceRocket");
            countIceRocket++;
            stock.setIceRockets(stock.getIceRockets() - countIceRocket);
        }
        return new IceRocket();
    }

    //Order Magnum
    @Override
    public Magnum orderMagnum(Magnum.MagnumType name) {
//        this.prepareMagnum(Magnum.MagnumType.valueOf());
        return new Magnum(name);
    }

    //Prepare Magnum
    private Magnum prepareMagnum(Magnum.MagnumType name)  {

        int countMagnum = 1;

        if (stock.getMagni() < 0 ) {
            try {
                throw new NoMoreIceCreamException("No more Magnum");
            } catch (NoMoreIceCreamException e) {
                e.printStackTrace();
            }
//            System.out.println("No more Magnum"); // need to update the message
        } else {
            for (int i = 0; i < stock.getMagni(); i++) {
                stock.setMagni(stock.getMagni() - stock.getMagni());
                profit += (pricelist.getMagnumPrice(name))/3;// need input
            }
            System.out.println("Your Magnum is processing");
            countMagnum++;
            stock.setMagni(stock.getMagni() - countMagnum);
        }
        return new Magnum();
    }
    // Profit
    public double getProfit() {
//        this.profit = 1.5;
        return profit;
    }




}
