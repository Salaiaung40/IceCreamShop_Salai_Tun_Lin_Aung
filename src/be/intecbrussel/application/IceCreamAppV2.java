package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList2 = new PriceList(2, 4, 8);

        Stock stock = new Stock(2, 8, 5, 1);

        IceCreamCar iceCreamCar = new IceCreamCar(priceList2, stock);

        Eatable[] eatCar = {
                iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA}),
                iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.STRACIATELLA}),
                iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.STRACIATELLA}),

                iceCreamCar.orderIceRocket(),
                iceCreamCar.orderIceRocket(),
                iceCreamCar.orderIceRocket(),

                iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),

        };

        for (int i = 0; i < eatCar.length; i++) {

            try {
                eatCar[i].eat();


            } catch (IceCreamCar.NoMoreIceCreamException message) {
                message.getMessage();
            }

        }
        System.out.println("Total Price: " + "$" + iceCreamCar.getTotalPrice());
        System.out.println("Total Profit: " + "$ " + iceCreamCar.getProfit());
    }

}
