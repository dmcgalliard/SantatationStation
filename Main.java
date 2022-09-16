public class Main {
   
    public static void main(String[] a) {
        Sanatizer s1 = new Sanatizer(); 
        Sanatizer s2 = new Sanatizer("Germ-X", 0.8);
        Sanatizer s3 = new Sanatizer("Solimo", 0.5, true);


        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
    }

  
    


    
}

