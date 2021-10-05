public class DemoNpe{
    public static void main(String[] args) {
        Neighborhood n = new Neighborhood();
        System.out.println(
            n.h.garage.car
        );
    }
}

class Car{
    String brand;
    int year;
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
}

class Garage{
    Car car = new Car("Honda",1999);
}

class House{
    Garage garage = new Garage();
}

class Neighborhood{
    House h = null;
}


