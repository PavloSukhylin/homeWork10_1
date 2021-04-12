package hw10_1;

public class Earth extends Planet {
    public Earth(String name, double radius, double weight) {
        super(name, radius, weight);
    }

    private double EARTHWEIGHT = 5.976E+24;  // на всякий случай, да и для второго способа вывода сохранил конствнты
    private double EARTHRADIUS = 6.378E+6;

    public double getEARTHWEIGHT() {
        return EARTHWEIGHT;
    }

    public double getEARTHRADIUS() {
        return EARTHRADIUS;
    }

    public void callTheRain() {                     //добавил немного методов для класса Earth
        System.out.println("На Земле пошел дождь.");
    }

    public void stopTheRain() {
        System.out.println("на Земле дождь прекратился.");
    }

    @Override
    public void freeFallAcceleration() {            //метод интерфейса в действии
        System.out.println("Ускорение свободного падения = 9.8м/с2");
    }
}