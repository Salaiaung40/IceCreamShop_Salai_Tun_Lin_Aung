package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList2 = new PriceList(2, 5, 8);

        Stock stock = new Stock(1, 8, 2, 1);

        IceCreamCar iceCreamCar = new IceCreamCar(priceList2, stock);

        Eatable[] eatCar = {
                iceCreamCar.orderCone(new Cone.Flavor[]{ Cone.Flavor.MOKKA}),
                iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.STRACIATELLA}),
                iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                iceCreamCar.orderIceRocket()
        };

        for (int i = 0; i < eatCar.length; i++) {
            try {
                eatCar[i].eat();
            } catch (Exception e) {
//                e.IceCreamCar.NoMoreIceCreamException;
                System.out.println("No More Item To sell!!");
//
            }

        }
        System.out.println("Total Profit: " + "$ "+iceCreamCar.getProfit());
    }

}
