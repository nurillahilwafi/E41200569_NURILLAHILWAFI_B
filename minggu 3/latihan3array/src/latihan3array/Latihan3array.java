/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3array;

/**
 *
 * @author User
 */
public class Latihan3array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] angka = {{1,2,3,4,5},{6,7,8,9,1},{3,2,5,6,9},{1,8,6,4,3}};
        
        for (int baris = 0; baris < 4; baris++){
            for (int kolom = 0; kolom < 5; kolom++){
                System.out.print(angka[baris][kolom]+ " ");
            }
            System.out.println(" ");
        }
    }
    
}
