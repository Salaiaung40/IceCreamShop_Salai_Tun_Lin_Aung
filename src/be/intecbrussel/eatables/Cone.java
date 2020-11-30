package be.intecbrussel.eatables;
// need to move enmu method here, price and eat method

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Cone Class
public class Cone implements Eatable {

    //Nested enum Class
    public enum Flavor {
        STRAWBERRY(),
        BANANA(),
        CHOCOLATE(),
        VANILLA(),
        LEMON(),
        STRACIATELLA(),
        MOKKA(),
        PISTACHE()

/*
        public final double price;

        public Flavor(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Your order : " + name() + "  $ " + price;
        }

 */

    }


    // Constructors
    public Cone() {

    }

    Flavor[] balls = Flavor.values(); // we can make a constructor at the Flavor class

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }
//print all the Cone Flavors
    public void allConeFlavors(){
        System.out.println("Available Cone flavor are :");
        for (Flavor f: balls) {

            System.out.printf("%s\t", f);

        };
        System.out.println();

    }

    //Getter method
    public Flavor[] getBalls(Flavor balls) {
        switch (balls){
            case STRAWBERRY:
                balls = Flavor.STRAWBERRY;
                break;
            case BANANA:
                balls = Flavor.BANANA;
                break;
            case CHOCOLATE:
                balls = Flavor.CHOCOLATE;
                break;
            case VANILLA:
                balls = Flavor.VANILLA;
                break;
            case LEMON:
                balls = Flavor.LEMON; break;
            case STRACIATELLA:
                balls = Flavor.STRACIATELLA; break;
            case MOKKA:
                balls = Flavor.MOKKA; break;
            case PISTACHE:
                balls = Flavor.PISTACHE; break;
            default:
                System.out.println("Not available");
        }
//        return new Flavor[] {Flavor.valueOf(balls.name())};
//        return new Flavor[]{balls.ordinal()};

        return new Flavor[]{balls};
    }

    @Override
    public void eat() {
        System.out.printf("Your Order - Cone with %s\n", (Object[]) this.balls);
    }


}