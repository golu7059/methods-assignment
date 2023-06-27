package method;
import java.util.*;
public class average {
    public static void main(String[] args) {
        System.out.println("Enter three numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //print code
        sc.close();
        System.out.println(avg(a,b,c));

    }
    public static int avg(int a , int b , int c) {
        System.out.println('\n' + "Average of given numbers are :");
        return  (a+b+c)/3;
    }
    
}
