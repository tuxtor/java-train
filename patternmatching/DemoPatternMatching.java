public class DemoPatternMatching{
    public static void main(String[] args) {
        var victor = new Person("Victor", "me@vorozco.com");
        testObject(victor);

        var foo = "Academik Rulz!";
        testObject(foo);
    }

    public static void testObject(Object o){
        if(o instanceof Person p){
            System.out.println("Hello " + p.name());
        }else{
            System.out.println("Unknown object");
        }
    }
}

record Person(String name, String email){}