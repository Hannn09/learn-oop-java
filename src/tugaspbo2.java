/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
/**
 *
 * @author REIHAN
 */
public class tugaspbo2 {
    public static void main(String[] args) {
        Mobil data = new Mobil();
        
        data.setmobil("Lamborghini");
        data.sethargamobil(1000000.0);
        data.setwarna("Merah");
        
        System.out.println("Merk Mobil :"+data.getmobil());
        System.out.println("Harga Mobil : Rp."+data.gethargamobil());
        System.out.println("Warna : "+data.getwarna());
    }
}
