package hw10_1;

public class Mars extends Planet {

    public Mars(String name, double radius, double weight) {
        super(name, radius, weight);
    }

    private double MARSWEIGHT = 0.63345E+24;
    private double MARSRADIUS = 3.488E+6;

    public double getMARSWEIGHT() {
        return MARSWEIGHT;
    }

    public double getMARSRADIUS() {
        return MARSRADIUS;
    }

    @Override
    public void freeFallAcceleration() {
        System.out.println("Ускорение свободного падения  = 3.86м/с2");
    }
}
