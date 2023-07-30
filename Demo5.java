public class Demo5 {
    public static void main(String[] args) {
        int int1 = 978;
        int int2 = 3;
        int int3 = 16;
        int int4 = 1484100;

        String color1 = "\033[35:1m";
        String color2 = "\033[36:1m";
        String color3 = "\033[34:1m";
        String color4 = "\033[33:1m";
        String reset = "\033[0m";

        System.out.printf("%s%s%s-%s%s%3$s-%s%s%3$s-%s%s%3$s \n" , color1, int1, reset, color2, int2, color3, int3, color4, int4);
    }
    
}
