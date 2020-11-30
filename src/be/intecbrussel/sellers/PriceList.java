package be.intecbrussel.sellers;


import be.intecbrussel.eatables.Magnum;

import java.util.Scanner;

public class PriceList {
    // Create functions Instance Variables ballPrice double, rocketPrice double, magnumStandardPrice double
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


    //Create Constructor methods
    public PriceList() {

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


//    Magnum.MagnumType magnum;

    double magnumPrice;

    public double getMagnumPrice(Magnum.MagnumType name) {
        // Calculation for the price
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

/*
    public void eachPriceList() {
//        Scanner key = new Scanner(System.in);
//        System.out.print("Please enter your words: ");
//        Magnum.MagnumType inputWords = Magnum.MagnumType.valueOf(key.next());
//        System.out.println("Your Order  cost - " + "$" + getMagnumPrice(inputWords));

//        System.out.println("Your Order  cost - " + "$" + getBallPrice());
//        System.out.println("Your Order  cost - " + "$" + getRocketPrice());
    }

 */

}

