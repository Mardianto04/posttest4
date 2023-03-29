/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest4;

/**
 *
 * @author ASUS
 */

public class Martabak {
   public String jenis;
    public int harga;
    
    public Martabak (String jenis, int harga){
        this.jenis = jenis;
        this.harga = harga;        
    }
    
//    public void setjenis (String jenis){
//        this.jenis = jenis;
//    }
//     public void setrasa (String rasa){
//        this.rasa = rasa;
//    }
//      public void setharga (int harga){
//        this.harga = harga;
//    }

    public String getJenis() {
        return jenis;
    }


    public int getHarga() {
        return harga;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void display(){
        System.out.println("harga : " + this.harga);
    }
    public void display(boolean martabak){
        if (martabak){
            System.out.println("Jenis :  " + this.jenis );
            System.out.println("harga : " + this.harga);
        } else {
            System.out.println("harga : " + this.harga);
        }
    }
}


    