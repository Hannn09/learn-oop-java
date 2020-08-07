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
public class TugasPBO {

    public static void main(String[] args) {
        String Warna = "Biru";
        int Jumlah = 13;
        
        P Bunga = new P(Warna, Jumlah);
        Bunga.mekar();
        Bunga.layu();
        Bunga.showData();
    }
    
}
