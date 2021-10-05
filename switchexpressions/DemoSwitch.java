public class DemoSwitch{
    public static void main(String[] args) {

        String langType = switch (args[0]) {
            case "Java", "Scala", "Kotlin" -> "Static typed";
            case "Groovy", "JavaScript" -> "Dynamic typed";
            default -> {
                System.out.println("This meant to be a processing block");
                yield "Probably LISP :)";
            }
        };
        System.out.println(langType);
    }
}