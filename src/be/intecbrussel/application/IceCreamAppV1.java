package be.intecbrussel.application;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;


public class IceCreamAppV1 {
    public static void main(String[] args) {

        //Printing available Ice Creams
        allMagnumTypes();
        allConeFlavors();
        System.out.println();

        // New Price lists
        PriceList priceList = new PriceList(1, 2, 2);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);


        Eatable[] eatSalon = {

                iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS),

                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE}),
                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.VANILLA}),

                iceCreamSalon.orderIceRocket(),

        };
        for (int i = 0; i < eatSalon.length; i++) {
            eatSalon[i].eat();

        }

        System.out.println("Total Price: " + "$" + iceCreamSalon.getTotalPrice());
        System.out.println("Total Profit: " + "$" + iceCreamSalon.getProfit());
        System.out.println(iceCreamSalon.toString());

    }

    //print method for all Magnum Types

    public static void allMagnumTypes() {
        Magnum.MagnumType[] type = Magnum.MagnumType.values();
        System.out.println("Available Magnum type flavors are :");
        for (Magnum.MagnumType mt : type) {
            System.out.printf("%s\t", mt);
        }
        System.out.println();
    }

    //print method for all the Cone Flavors
    public static void allConeFlavors() {
        Cone.Flavor[] balls = Cone.Flavor.values();
        System.out.println("Available Cone flavor are :");
        for (Cone.Flavor f : balls) {
            System.out.printf("%s\t", f);
        }
        System.out.println();

    }
}
