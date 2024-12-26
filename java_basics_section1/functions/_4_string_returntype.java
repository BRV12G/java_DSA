package java_basics_section1.functions;

public class _4_string_returntype {
    public static void main(String[] args) {
        String res = greet();
        System.out.println(res);
    }

    static String greet() {
        // return "hello";
        String greeting = "hello how are you?";
        return greeting;
    }
}
