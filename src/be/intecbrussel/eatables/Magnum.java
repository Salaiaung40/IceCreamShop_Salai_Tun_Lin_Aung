package be.intecbrussel.eatables;

import be.intecbrussel.application.IceCreamAppV1;
import be.intecbrussel.sellers.PriceList;

import java.util.Scanner;


// Nested Magnum Class
public class Magnum implements Eatable {

    //enum Class
    public enum MagnumType {
           MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES;


    }

    // Constructors
    public Magnum() {

    }

    MagnumType type;
    PriceList priceListMagnum;

    public Magnum(MagnumType type) {

        this.type = type;
    }

    //print all Magnum Types

    public void allMagnumTypes() {
        MagnumType[] type = MagnumType.values();
//        PriceList priceList1 = new PriceList();

        System.out.println("Magnum type flavors are :");
        for (MagnumType mt : type) {
            System.out.printf("%s\t", mt);
//            System.out.printf("%s\t$%s\t", mt, priceList1.getMagnumPrice(mt));
        }
        System.out.println();
    }


    public MagnumType getType(MagnumType types) {

        switch (types) {
            case MILKCHOCOLATE:

                type = MagnumType.MILKCHOCOLATE;
                break;

            case WHITECHOCOLATE:
                type = MagnumType.WHITECHOCOLATE;
                break;
            case BLACKCHOCOLATE:
                type = MagnumType.BLACKCHOCOLATE;
                break;
            case ALPINENUTS:
                type = MagnumType.ALPINENUTS;
                break;
            case ROMANTICSTRAWBERRIES:
                type = MagnumType.ROMANTICSTRAWBERRIES;
                break;

            default:
                System.out.println("Not available");
        }


        return type;
    }


    @Override
    public void eat() {
//        Scanner key = new Scanner(System.in);
//        System.out.print("Please enter your Magnum Types: ");
//        MagnumType inputWords = MagnumType.valueOf(key.next());
//        System.out.println("Your Order - " + getType(inputWords));
        System.out.println("Your Order - Magnum " + type);
//        System.out.println(priceListMagnum.getMagnumPrice(type));

    }


}
