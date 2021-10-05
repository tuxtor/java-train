import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoTypes {
    public static void main(String args[]){
        var localValue = 99;
        System.out.println(++localValue);
        //localValue = "Foo"


        BiPredicate<String, String> demoPredicate = (var a, var b) -> a.equals(b);
        System.out.println(
            demoPredicate.test("Foo", "Bar")
        );
    }

    
    
}