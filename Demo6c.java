public class Demo6c {
    public static void main(String[] args) {
        String str1 = " CITY";
        String str2 = " STATE";
        String str3 = " POPULATION";
        String city1 = " Los Angeles";
        String city2 = " \033[32mNew \033[0mYork";
        String state1 = " California";
        String state2 = city2;
        int population1 = 3966936;
        int population2 = 8336817;


        String linecolor = "\033[33m"; //yelow color
        String fcolor1 = "\033[37;1m"; // white bold
        String fcolor2 = "\033[37:1m"; //white not bold
        String fcolor3 = "\033[35:1m"; //pink not bold

        String reset = "\033[0m";


        System.out.printf("%s+---------------+------------+------------+%s \n" , linecolor, reset);
        System.out.printf("%s|%s%-15s%1$s|%2$s%-12s%1$s|%2$s%-12s%1$s|%s\n" ,linecolor, fcolor1, str1, str2, str3, reset);
        System.out.printf("%s+---------------+------------+------------+%s \n" , linecolor, reset);
        System.out.printf("%s|%s%-15s%1$s|%2$s%-12s%1$s|%s%, -12d%1$s|%2$s\n" , linecolor, reset, city1, state1, fcolor3, population1);
        System.out.printf("%s|%s%-24s%1$s|%2$s%-21s%1$s|%s%, -12d%1$s|%2$s\n" , linecolor, reset, city2, state2, fcolor3, population2);
        System.out.printf("%s+---------------+------------+------------+%s \n" , linecolor, reset);


        


    }
    
}
