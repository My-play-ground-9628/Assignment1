public class Demo6a {
    public static void main(String[] args) {
        String bcolor1 = "\033[41m";
        String bcolor2 = "\033[45m";
        String fcolor1 = "\033[35m";
        String fcolor2 = "\033[30m";
        String reset = "\033[0m";

        String str1 = "5";
        String str2 = "0%";
    

        //System.out.printf("%s%s%7s%s%s%s%-7s%s \n" , bcolor1,fcolor1,5,reset,bcolor2, fcolor2, 0, reset);
        System.out.printf(" %s%s[%7s%s%s%s%-7s]%s\n" , bcolor1, fcolor1, str1, reset, bcolor2, fcolor2, str2, reset);
    }
    
}
