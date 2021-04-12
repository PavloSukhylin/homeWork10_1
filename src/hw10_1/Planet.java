package hw10_1;

public abstract class Planet implements packagePlanetInterface.Planet {
    private double weight;                                              //родительский класс с наследованием интерфеса
    private double radius;                                              // Planet. Имена у класса и интерфейса одинаковые,
    private String name;                                                // поэтому находятся в разных package

    public String getName() {                                           // нужен геттер для второго способа вывода
        return name;
    }


    public Planet(String name, double radius, double weight) {          //конструктор класса
        this.name = name;
        this.radius = radius;
        this.weight = weight;
    }

    public void printOutPlanetInfo(String name, double radius, double weight) {  //функция вывода данных
        System.out.println("Планета " + name + " имеет радиус " + radius + "м и массу " + weight + "кг");
    }

}
