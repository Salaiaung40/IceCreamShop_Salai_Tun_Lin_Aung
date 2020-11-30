package be.intecbrussel.eatables;
// not sure that have to Nested in the Cone Class or not.

public enum FlavorFile {
    STRAWBERRY(1.5),
    BANANA(2),
    CHOCOLATE(1),
    VANILLA(1),
    LEMON(1),
    STRACIATELLA(2),
    MOKKA(1),
    PISTACHE(1.5);


    public final double price;

    FlavorFile(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Your order : " + name() + "  $ " + price;
    }

}
