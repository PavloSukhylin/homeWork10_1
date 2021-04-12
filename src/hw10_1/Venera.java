package hw10_1;

public class Venera extends Planet {

    public Venera(String name, double radius, double weight) {
        super(name, radius, weight);

    }

    private double VENERAWEIGHT = 4.81068E+24;
    private double VENERARADIUS = 6.052E+6;

    public double getVENERAWEIGHT() {
        return VENERAWEIGHT;
    }

    public double getVENERARADIUS() {
        return VENERARADIUS;
    }

    @Override
    public void freeFallAcceleration() {
        System.out.println("Ускорение свободного падения = 8.88м/с2");
    }

}
