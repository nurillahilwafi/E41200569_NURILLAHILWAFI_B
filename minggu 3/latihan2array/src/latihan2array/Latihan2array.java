/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2array;

/**
 *
 * @author User
 */
public class Latihan2array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] angka = {1,2,3,4,5,6,7};
        String [] teks = {"kholifah yasinta anwar"};
        
        for (int i = 0; i<angka.length; i++) {
            System.out.println(angka[i]);
        }
        
        for (int j = 0; j<teks.length; j++){
            System.out.print(teks[j]);
            System.out.print(" ");
        }
        
    }
    
}
