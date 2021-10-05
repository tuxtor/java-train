public class DemoRecords{
    public static void main(String[] args) {
        Person foo = new Person("Marco", "example@mail.com",99);
        System.out.println(foo);
        //foo.name = "Polo";
        System.out.println(foo.name());
    }
}

record Person(String name, String email, int age) {}