  package method;
 
 import java.util.Scanner;
public class middle{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("Enter the String : ");
String s = scn.nextLine();
scn.close();
System.out.print(middle(s));
}

public static String middle(String s){
if(s.length() % 2 == 0){
return s.substring(s.length()/2, s.length()/2 + 2);
}else{
return s.substring(s.length()/2, s.length()/2 + 1);
}
}
}