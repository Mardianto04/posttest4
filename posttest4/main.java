package com.mycompany.posttest4;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author ASUS
 */

public class main {
    public static void main(String[] args) throws IOException {
        // Array list isinya bisa campuran int string
        ArrayList <asin> Asin = new ArrayList<>();
        ArrayList <manis> manis = new ArrayList<>();


        String jenisT = "", jenisD="";
        int harga;
        

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("[1] tambah jenis martabak");
            System.out.println("[2] lihat menu ");
            System.out.println("[3] Ubah jenis");
            System.out.println("[4] hapus martabak");
            System.out.println("[5] Exit\n");

            System.out.print("Masukkan Pilihan: ");
            int menu, pilih;
            menu = Integer.parseInt(br.readLine());
            if (menu == 1) {
                // CREATE
                System.out.println("====PILIH JENIS MARTABAK====");
                System.out.println("1. Asin");
                System.out.println("2. Manis");
                System.out.println("Masukkan Pilihan...");
                pilih = Integer.parseInt(br.readLine());
                if(pilih==1){
                    System.out.print("| Masukkan harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.println("| Masukkan jenis daging: ");
                    System.out.println("1. Daging Ayam");
                    System.out.println("2. Daging Sapi");
                    System.out.println("Masukkan Pilihan...");
                    int select;
                    select = Integer.parseInt(br.readLine());
                    
                    if (select==1){
                        jenisD = "Ayam";
                    }else if (select==2){
                        jenisD = "Sapi";
                    }
                    System.out.print("| Masukkan jenis telur: ");
                    System.out.println("1. Telur Ayam");
                    System.out.println("2. Telur Bebek");
                    System.out.println("Masukkan Pilihan...");
                    select = Integer.parseInt(br.readLine());
                    
                    if (select==1){
                        jenisT = "Ayam";
                    }else if (select==2){
                        jenisT = "Bebek";
                    }
                    asin newData = new asin(jenisT, jenisD, "Asin", harga);  
                    Asin.add(newData);
                }else if(pilih==2){
                    System.out.print("| Masukkan harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.print("| Masukkan rasa: ");
                    System.out.println("1. Keju");
                    System.out.println("2. Coklat");
                    System.out.println("Masukkan Pilihan...");
                    menu = Integer.parseInt(br.readLine());
                    
                    if (menu==1){
                        jenisD = "Keju";
                    }else if (menu==2){
                        jenisD = "Coklat";
                    }
                    System.out.print("| Masukkan topping: ");
                    System.out.println("1. Meses ceres");
                    System.out.println("2. Wijen");
                    System.out.println("Masukkan Pilihan...");
                    menu = Integer.parseInt(br.readLine());
                    
                    if (menu==1){
                        jenisT = "Meses Ceres";
                    }else if (menu==2){
                        jenisT = "Wijen";
                    }
                    manis newData = new manis(jenisT, "Manis", jenisD, harga); 
                    manis.add(newData);
                }
  
                
                System.out.println("");

            } else if (menu == 2) {
                // READ
                
                System.out.println("====PILIH JENIS MARTABAK====");
                System.out.println("1. Asin");
                System.out.println("2. Manis");
                System.out.println("Masukkan Pilihan...");
                pilih = Integer.parseInt(br.readLine());
                if (pilih == 1){
                    for (int i = 0; i < Asin.size(); i++) {
                        System.out.println("====MARTABAK ASIN====");
                        System.out.println("No. " + (i+1));
                        Asin.get(i).display();
                        System.out.println("==========================");
                    }
                } else if (pilih == 2){
                    for (int i = 0; i < manis.size(); i++) {
                        System.out.println("====MARTABAK MANIS====");
                        System.out.println("No. " + (i+1));
                        manis.get(i).display();
                        System.out.println("==========================");
                    }
                } 
            } else if (menu == 3) {
                System.out.println("1. asin");
                System.out.println("2, manis");
                System.out.println("3. masukkan pilihan"); int pilihan = Integer.parseInt(br.readLine());
                if (pilihan == 1) {
                    System.out.println("martabak: "); 
                    String Ubah = br.readLine();
                    for (asin Martabak : Asin){
                        if(Martabak.getJenis().equals(Ubah)){
                            System.out.println("| Masukkan jenis martabak : "); 
                            Martabak.setJenis(br.readLine());
                            System.out.println("| Masukkan harga martabak : "); 
                            Martabak.setHarga (Integer.parseInt(br.readLine()));
                            System.out.println("masukkan jenis daging");
                            Martabak.setJenisdaging(br.readLine());
                            System.out.println("masukkan jenis telur");
                            Martabak.setJenistelur(br.readLine());
                        }
                    }
                } else if (pilihan == 2) {
                    System.out.println("martabak: "); 
                    String Ubah = br.readLine();
                    for (manis terangbulan : manis){
                        if(terangbulan.getJenis().equals(Ubah)){
                            System.out.println("| Masukkan jenis martabak : "); 
                            terangbulan.setJenis(br.readLine());
                            System.out.println("| Masukkan harga martabak : "); 
                            terangbulan.setHarga (Integer.parseInt(br.readLine()));
                            System.out.println("masukkan jenis daging");
                           terangbulan.setToping(br.readLine());
                            System.out.println("masukkan jenis telur");
                           terangbulan.setRasa(br.readLine());
                        }
                    }
                }
            
            } else if (menu == 4) {
                System.out.println("1. asin");
                System.out.println("2. manis");
                System.out.println("3. masukkan pilihan"); int pilihan = Integer.parseInt(br.readLine());
                
                if (pilihan == 1){
                     System.out.println("martabak: "); 
                     String Ubah = br.readLine();
                     for (int i = 0; i<Asin.size();i++){
                         if (Asin.get(i).getJenis().equals(Ubah)){
                             Asin.remove(i);
                             System.out.println("data telah terhapus");
                         }
                     }
                }else if (pilihan == 2){
                    System.out.println("martabak: "); 
                     String Ubah = br.readLine();
                     for (int i = 0; i<manis.size();i++){
                         if (manis.get(i).getJenis().equals(Ubah)){
                             manis.remove(i);
                             System.out.println("data telah terhapus");
                                     
                    }
                }
            }
            } else if(menu == 5){
                System.out.print("TERIMAKASIH TELAH BERKUNJUNG KE kedai KAMI");
                System.out.println("SAMPAI BERTEMU");
                break;
            }else {
                System.out.println("Masukkin yang bener!");
            }
        }
    }
}