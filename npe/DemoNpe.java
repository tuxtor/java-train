public class DemoNpe{
    public static void main(String[] args) {
        Neighborhood n = new Neighborhood();
        System.out.println(
            n.h.garage.car
        );
    }
}

record Car(String brand, int year){}

class Garage{
    Car car = new Car("Honda",1999);
}

class House{
    Garage garage = new Garage();
}

class Neighborhood{
    House h = null;
}


