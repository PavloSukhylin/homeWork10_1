package hw10_1;

public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth("Земля", 6.378E+6, 5.976E+24); //определяем объекты классов
        Mars mars = new Mars("Марс", 3.488E+6, 0.63345E+24);
        Venera venera = new Venera("Венера", 6.052E+6, 4.81068E+24);
        Merkury merkury = new Merkury("Меркурий", 2.439E+6, 0.32868E+24);

        earth.printOutPlanetInfo("Земля", 6.378E+6, 5.976E+24);
        earth.freeFallAcceleration();
        mars.printOutPlanetInfo("Марс", 3.488E+6, 0.63345E+24);
        mars.freeFallAcceleration();
        System.out.println("Планета " + venera.getName() + " имеет радиус " + venera.getVENERARADIUS() + "м и массу " + venera.getVENERAWEIGHT() + "кг");
        venera.freeFallAcceleration();
        System.out.println("Планета " + merkury.getName() + " имеет радиус " + merkury.getMERKURYRADIUS() + "м и массу " + merkury.getMERKURYWEIGHT() + "кг");
        merkury.freeFallAcceleration();
        earth.callTheRain();
        earth.stopTheRain();
    }
}
