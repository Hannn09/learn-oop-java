/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

/**
 *
 * @author REIHAN
 */
public class P {
    private String Warna;
    private int Jumlah;
    
    public P(String Warna, int Jumlah) {
        this.Warna = Warna;
        this.Jumlah = Jumlah;
        System.out.println("Inisialisasi Atribut");
    }
    void mekar (){
        System.out.println("Bunga mekar");
    }
    void layu (){
        System.out.println("Bunga layu");
    }
    void showData(){
        System.out.println("Warna :"+this.Warna);
        System.out.println("Jumlah :"+this.Jumlah);
    }
}
