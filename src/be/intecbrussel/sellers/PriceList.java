package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;


public class PriceList {
    // Create functions Instance Variables
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


    //Constructor
    public PriceList() {
        this.ballPrice = 1;
        this.rocketPrice = 1;
        this.magnumStandardPrice = 2;

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }


    // Create Getter and Setter methods

    public void setBallPrice(double ballPrice) {

        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {

        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {

        return ballPrice;
    }

    public double getRocketPrice() {

        return rocketPrice;
    }


    public double getMagnumStandardPrice() {
        return magnumStandardPrice;
    }

    // Calculation for the price
    public double getMagnumPrice(Magnum.MagnumType name) {
        double magnumPrice = 0;
        switch (name) {
            case MILKCHOCOLATE:
                magnumPrice = magnumStandardPrice;
                break;
            case WHITECHOCOLATE:
                magnumPrice = magnumStandardPrice * 1.2;
                break;
            case BLACKCHOCOLATE:
                magnumPrice = magnumStandardPrice * 1.4;
                break;
            case ALPINENUTS:
                magnumPrice = magnumStandardPrice * 1.5;
                break;
            case ROMANTICSTRAWBERRIES:
                magnumPrice = magnumStandardPrice * 2;
                break;
            default:
                System.out.println("Not available");
        }
        return magnumPrice;
    }


}

