/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan27.huruf.besar.kecil;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IF110119014Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String besar, kecil;
    Scanner scanner = new Scanner (System.in);
    System.out.print("Masukan Kalimat : ");
    String nama = scanner.nextLine();
    System.out.println();
    System.out.println("====Hasil Formatting===");
    System.out.println("Huruf Besar : "+nama.toUpperCase());
    System.out.println("Huruf kecil : "+nama.toLowerCase());
    }
    
}
