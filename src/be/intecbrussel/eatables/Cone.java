package be.intecbrussel.eatables;

// Cone Class
public class Cone implements Eatable {
    private Flavor[] balls;

    // Constructors
    public Cone() {
        this.balls[0] = Flavor.STRAWBERRY;

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    //Getter method
    public Flavor[] getBalls(Flavor balls) {
        return new Flavor[]{balls};
    }

    @Override
    public void eat() {
        System.out.printf("Your Order - Cone with %s\n", (Object[]) this.balls);
    }

    //Nested enum Class
    public enum Flavor {
        STRAWBERRY(), BANANA(), CHOCOLATE(), VANILLA(), LEMON(), STRACIATELLA(), MOKKA(), PISTACHE()
    }


}