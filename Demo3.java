public class Demo3 {
    public static void main(String[] args) {
        int myInt1 = 123;
        int myInt2 = 456;
        int myInt3 = 7890;
        final String COLOR = "\033[32:1m";
        final String RESET = "\033[0m";
        System.out.printf(" %s(%d)%s %d-%d\n" , COLOR, myInt1, RESET, myInt2, myInt3);
    }
    
}
