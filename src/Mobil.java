/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author REIHAN
 */
public class Mobil {
    
    private String mobil;
    private double hargamobil;
    private String warna;
    
    public void setmobil(String mobil){
        this.mobil = mobil;
    }
    
    public void sethargamobil(double hargamobil){
        this.hargamobil = hargamobil;
    }
    
    public void setwarna(String warna){
        this.warna = warna;
    }
    
    public String getmobil(){
        return mobil;
    }
    
    public double gethargamobil(){
        return hargamobil;
    }
    
    public String getwarna(){
        return warna;
    }
}
