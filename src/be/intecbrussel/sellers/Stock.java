package be.intecbrussel.sellers;

public class Stock {
    // Create functions for iceRockets, cones, balls, magni in int.
    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    // Create Getter and Setter methods


    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }


    //Create constructor
    public Stock() {
        this.iceRockets = 1;
        this.cones = 1;
        this.balls = 1;
        this.magni = 1;
    }

    public Stock( int cones, int balls,int iceRockets, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }
}
