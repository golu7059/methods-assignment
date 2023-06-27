package method;
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        sc.close();
        System.out.println(leap(year));
    }
    public static boolean leap(int y) {
        boolean a = (y%4) == 0;
        boolean b = (y%100) == 0;
        boolean c = (y%400) == 0 ;
        return a || b && c;
    }
    
}
