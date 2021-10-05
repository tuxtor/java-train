import java.util.Set;
import java.util.List;

public class DemoCollections {

    public static void main(String args[]){
        Set<String> set = Set.of("Java", "Kotlin", "Scala");
        List<String> list = set.stream().toList();
        System.out.println(set);
    }
}