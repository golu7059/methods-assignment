package method;
// in this code direct method is used
 class addition2 {
    public void Add (int p,int q)
    {
     int add = p+q;
     System.out.println("Sum is : " + add );
    }
    public static void main(String[] args) {
        int p = 28;
        int q = 23;
        // Creation of the object
        addition2 golu = new addition2();
        // now calling the method
        golu.Add(p, q);
       
        
    }
    
}
