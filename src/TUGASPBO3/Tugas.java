/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGASPBO3;

import java.util.Scanner;

/**
 *
 * @author REIHAN
 */
public class Tugas {
    
    public static void main(String[] args) {
        
        Scanner opr = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan Pertama :");
        int x = opr.nextInt();
        
         System.out.println("Masukkan Bilangan Kedua :");
        int y = opr.nextInt();
        
         System.out.println("Hasil Perhitungan :");
         
         Operasi akhir = new Operasi(x, y);
          System.out.println("Hasil Penjumlahan :" +akhir.getNilaiPenjumlahan());
           System.out.println("Hasil Pengurangan :" +akhir.getNilaiPengurangan());
            System.out.println("Hasil Perkalian :" +akhir.getNilaiPerkalian());
             System.out.println("Hasil Pembagian :" +akhir.getNilaiPembagian());
    }
}
