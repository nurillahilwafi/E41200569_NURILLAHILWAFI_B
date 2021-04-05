
package tugas2;

public class Tugas2 {

    public static void main(String[] args) {
        int nil= 2;

        System.out.println("         Case 1");
        System.out.println("    Perkalian 2 (1-100)");
        System.out.println("============================");

        System.out.print("     " + nil+ " ");
        do {
            nil *= 2;
            if (nil > 100){
                break;
            }
            System.out.print(nil + " ");
        } while (nil < 100);
        System.out.println("");
       
        System.out.println("----------------------------");
        
        //Case 2 Kelipatan 2
        int bil;
        
        System.out.println("         Case 2");
        System.out.println("    Kelipatan 2 (1-100)");
        System.out.println("============================");
        for(bil=2;bil<=100;bil++)
            if(bil%2==0)
                System.out.print(" " + bil + " ");
        
    }
    
}
