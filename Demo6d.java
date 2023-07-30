public class Demo6d {
    public static void main(String[] args) {
        String str1 = " ITEM";
        String str2 = " QUANTITY";
        String str3 = " PRICE";
        String item1 = " Apples";
        String item2 = " Oranges";
        String quantity1 = "5 ";
        String quantity2 = "10 ";
        String price1 = "\033[32m$\033[35m0.99";
        String price2 = "\033[32m$\033[35m1.49";


        String linecolor = "\033[33m"; //yelow color
        String fcolor1 = "\033[37;1m"; // white bold
        String fcolor2 = "\033[37:1m"; //white not bold
        String fcolor3 = "\033[34:1m"; //blue not bold
        

        String reset = "\033[0m";


        System.out.printf("%s+----------+----------+-------+%s \n" , linecolor, reset);
        System.out.printf("%s|%s%-10s%1$s|%2$s%-10s%1$s|%2$s%-7s%1$s|%s\n" ,linecolor, fcolor1, str1, str2, str3, reset);
        System.out.printf("%s+----------+----------+-------+%s \n" , linecolor, reset);
        System.out.printf("%s|%s%-10s%1$s|%s%10s%1$s| %-16s%1$s|%2$s\n" , linecolor, reset, item1, fcolor3, quantity1, price1);
        System.out.printf("%s|%s%-10s%1$s|%s%10s%1$s| %-16s%1$s|%2$s\n" , linecolor, reset, item2, fcolor3, quantity2, price2);
        System.out.printf("%s+----------+----------+-------+%s \n" , linecolor, reset);


    }
    
}
