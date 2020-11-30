package be.intecbrussel.application;


import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;

import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;
// Only 2 input name of the IceCream and number of Order
//can be add do you want to order/shop more? (Y/N)
//Print output Name, number of quantity, cost, (total, VTA, Total) balance, profit.

public class IceCreamAppV1 {
    public static void main(String[] args) {
    //Printing available Ice Creams
        Magnum magnum = new Magnum();
        magnum.allMagnumTypes();
        Cone cone = new Cone();
        cone.allConeFlavors();
        System.out.println();

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

        System.out.println("Total Profit: " + "$"+ iceCreamSalon.getProfit());
        System.out.println(iceCreamSalon.toString());

    }




}
