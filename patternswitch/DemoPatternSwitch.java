
public class DemoPatternSwitch {

    sealed class Animal permits Dog, Cat{
        String name = "Animal";
    }

    final class Dog extends Animal{ public Dog() { name = "Free of lice";} }
    final class Cat extends Animal{ public Cat() { name = "TomEE";} }

    String testAnimal(Object o){
        return switch(o){
            case Dog d -> "Dogs name is " + d.name;
            case Cat c -> "Server name is " + c.name;
            default -> "Not really an Animal";
        };
    }

    void doDemo(){
        Dog firulais = new Dog();
        System.out.println(testAnimal(firulais));
    }

    public static void main(String args[]){
        DemoPatternSwitch demo = new DemoPatternSwitch();
        demo.doDemo();
        
    }
    
}
