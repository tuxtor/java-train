public class DemoSealed {

    //class Animal{
    sealed class Animal permits Dog, Cat{
        String name = "Animal";
    }

    final class Dog extends Animal{ public Dog() { name = "Free of lice";} }
    final class Cat extends Animal{ public Cat() { name = "TomEE";} }
    //final class Airplane extends Animal{ public Airplane() { name = "Qatar Airways";}}

    public void doDemo(){
        Dog d = new Dog();
        System.out.println(d.name);
    }

    public static void main(String args[]){
        DemoSealed d = new DemoSealed();
        d.doDemo();
    }
    
}
