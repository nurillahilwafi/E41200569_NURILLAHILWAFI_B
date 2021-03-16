
package latihan4;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("masukkan nilai 1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("masukkan nilai 2 = ");
        int nilai2 = s1.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.print("jumlah = " + jumlah);
    }
    
    
}
