public class Demo6b {
    public static void main(String[] args) {
        String name1 = " Alice";
        String name2 = " Bob";
        int age1 = 24;
        int age2 = 30;
        String str1 = " NAME";
        String str2 = " AGE";

        String linecolor = "\033[33m"; //yelow color
        String fcolor1 = "\033[34;1m"; 
        String fcolor2 = "\033[35m";
        String reset = "\033[0m";



        System.out.printf("%s+---------------+-----+%s \n" , linecolor, reset);
        //System.out.printf("%1$s|%2$s %3$s%-15s%2$s %1$s|%2$sAGE|\n" , linecolor, reset, fcolor1, "NAME");
        System.out.printf("%s|%s%-15s%1$s|%2$s%-5s%1$s|%s\n" ,linecolor, fcolor1, str1, str2, reset);
        System.out.printf("%s+---------------+-----+%s \n" , linecolor, reset);
        System.out.printf("%s|%s%-15s%1$s|%s% 5d%1$s|\n" , linecolor, reset, name1, fcolor2, age1);
        System.out.printf("%s|%s%-15s%1$s|%s% 5d%1$s|\n" , linecolor, reset, name1, fcolor2, age1);
        System.out.printf("%s+---------------+-----+%s \n" , linecolor, reset);


    }
    
}
