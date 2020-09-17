/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGASPBO3;

/**
 *
 * @author REIHAN
 */
public class Operasi {
    
    int nilai1;
     int nilai2;
      int hasil;
       float hasill;
       
       public Operasi(int nilai1, int nilai2){
           
           this.nilai1 = nilai1;
           this.nilai2 = nilai2;
       }
       
       int getNilaiPenjumlahan(){
           hasil = nilai1 + nilai2;
           return hasil;
       }
       int getNilaiPengurangan(){
           hasil = nilai1 - nilai2;
           return hasil;
       }
       int getNilaiPerkalian(){
           hasil = nilai1 * nilai2;
           return hasil;
       }
       float getNilaiPembagian(){
           hasill = (float)nilai1 / (float)nilai2;
           return hasill;
       }
       
    
    
}
