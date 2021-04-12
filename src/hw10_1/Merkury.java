package hw10_1;

public class Merkury extends Planet {


    public Merkury(String name, double radius, double weight) {
        super(name, radius, weight);
    }

    private double MERKURYWEIGHT = 0.32868E+24;
    private double MERKURYRADIUS = 2.439E+6;

    public double getMERKURYWEIGHT() {
        return MERKURYWEIGHT;
    }

    public double getMERKURYRADIUS() {
        return MERKURYRADIUS;
    }

    @Override
    public void freeFallAcceleration() {
        System.out.println("Ускорение свободного падения = 3.7м/с2");
    }
}
