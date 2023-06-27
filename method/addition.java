package method;

public class addition {
    public int Add(int p,int q)
    {
     int add = p+q;
     return add;
    }
    public static void main(String[] args) {
        int p = 28;
        int q = 23;
        // Creation of the object
        addition golu = new addition();
        // now calling the method
        int answer = golu.Add(p, q);
        // Now print the output
        System.out.println("Sum is : " + answer);
    }
    
}
