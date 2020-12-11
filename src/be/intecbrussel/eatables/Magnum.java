package be.intecbrussel.eatables;

public class Magnum implements Eatable {
    private final MagnumType type;




    // Constructors

    public Magnum() {
        this.type = MagnumType.MILKCHOCOLATE;
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    //getter
    public MagnumType getType(MagnumType types) {
        return type;
    }


    @Override
    public void eat() {

        System.out.println("Your Order - Magnum " + type );
    }

    //enum Class
    public enum MagnumType {
        MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES
    }

}
