package method;

public class accessModifiers {
    public String str_1 = "I am a public member";

    void printFromClass(){
        System.out.println("Within class : " + str_1);
    }


    public static void main(String[] args) {
    accessModifiers obj = new accessModifiers();
    obj.printFromClass();
    System.out.println("within class : " + obj.str_1);

    App2 obj2 = new App2();
     obj2.printOutsideOfClass();
}
}
class App2{
    void printOutsideOfClass(){
        accessModifiers obj = new accessModifiers();
        System.out.println("Outside class : " + obj.str_1);
    }
}
