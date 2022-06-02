/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2_modul1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class S2_Modul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // sebagai method utama //
        System.out.println("Kalkulator sederhana:");
        System.out.println("Pilih(dengan mengetik jenis penjumlahan yang kamu inginkan):");
        System.out.println("Penjumlahan");
        System.out.println("Pengurangan");
        System.out.println("Perkalian");
        System.out.println("Pembagian");
        
        Scanner kal = new Scanner(System.in);
        String Kal = kal.nextLine();
        
        if (Kal.equals("Penjumlahan")){
            System.out.println("Masukkan angka:");               
             Scanner Ji = new Scanner(System.in);
             int a = Ji.nextInt();
             Scanner Li = new Scanner(System.in); 
             int b = Li.nextInt();
             
             int hasilA = a+b;
             System.out.println("Hasil Penjumlahan "+a+"dan"+b+"adalah"+hasilA);

        }
        else if (Kal.equals("Pengurangan")){
            System.out.println("Masukkan angka:");               
            Scanner Ji = new Scanner(System.in);
             int a = Ji.nextInt();
             Scanner Li = new Scanner(System.in); 
             int b = Li.nextInt();
             
             int hasilB = a-b;
             System.out.println("Hasil Perkalian "+a+"dan"+b+"adalah"+hasilB);

        }
        else if (Kal.equals("Perkalian")){
            System.out.println("Masukkan angka:");               
            Scanner Ji = new Scanner(System.in);
             int a = Ji.nextInt();
             Scanner Li = new Scanner(System.in); 
             int b = Li.nextInt();
             
             int hasilC = a*b;
             System.out.println("Hasil Perkalian "+a+"dan"+b+"adalah"+hasilC);

        }
        else if (Kal.equals("Pembagian")){
            System.out.println("Masukkan angka:");               
            Scanner Ji = new Scanner(System.in);
             int a = Ji.nextInt();
             Scanner Li = new Scanner(System.in); 
             int b = Li.nextInt();
             
             int hasilD = a/b;
             System.out.println("Hasil Penjumlahan "+a+"dan"+b+"adalah"+hasilD);

        }
    }
    
}
