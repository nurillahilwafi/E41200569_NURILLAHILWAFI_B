/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5cs;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Latihan5cs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("inputkan nama warna: ");
        lampu = scan.nextLine();
        
        switch (lampu){
            case "merah":
                System.out.println("lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("warna lampu salah!");
        }
    }
    
}
