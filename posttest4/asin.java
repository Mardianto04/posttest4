/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest4;

/**
 *
 * @author ASUS
 */
public class asin extends Martabak{
    private String jenistelur;
    private String jenisdaging;
    
    public asin(String jenistelur, String jenisdaging, String jenis, int harga) {
        super(jenis, harga);
        this.jenistelur = jenistelur;
        this.jenisdaging = jenisdaging;
    }

    public String getJenistelur() {
        return jenistelur;
    }

    public void setJenistelur(String jenistelur) {
        this.jenistelur = jenistelur;
    }

    public String getJenisdaging() {
        return jenisdaging;
    }

    public void setJenisdaging(String jenisdaging) {
        this.jenisdaging = jenisdaging;
    }   
    
    @Override
    public void display(){
        System.out.println("Telur : " + this.jenistelur);
        System.out.println("Daging : " + this.jenisdaging);
        System.out.println("harga : " + this.harga);
        super.display();
    }
}
