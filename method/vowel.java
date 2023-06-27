package method;

import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.println("NUmber of vowels in given sentense are : ");
        System.out.println(count(s));
        sc.close();
    }
    public static int count (String s )
    {
        int count = 0;
        for (int i =0 ; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
return count;
    }
    
}
