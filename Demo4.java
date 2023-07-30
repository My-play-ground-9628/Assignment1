public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String c1 = "\033[31:1m";
        String c2 = "\033[32:1m";
        String c3 = "\033[33:1m";
        String c4 = "\033[34:1m";
        String c5 = "\033[35:1m";
        String c6 = "\033[36:1m";
        String R = "\033[0m";
        
        //System.out.printf(" %1$s%2$s/%1$s%2$s/1$%s%2$s %1$s%2$s:%1$s%2$s:%1$s%2$s \n" , c1, R, month, day, year, hour, minute, second);
        System.out.printf(" %s%s%s/%s%s%3$s/%s%s%3$s %s%s%3$s:%s%s%3$s:%s%s%3$s \n" , c1, month, R, c2, day, c3, year, c4, hour, c5, minute, c6, second);
    }
    
}
