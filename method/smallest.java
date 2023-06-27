package method;
import java.util.*;
public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("Smallest among given numbers is : ");
        int d =  smallest(a, b, c);
        System.out.println(d);
    }
    public static int smallest(int a , int b, int c) {
        return Math.min(a , Math.min(b,c));
    }
     
}
