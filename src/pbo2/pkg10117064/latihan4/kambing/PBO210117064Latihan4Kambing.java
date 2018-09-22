/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan4.kambing;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * tambah kambing
 */
public class PBO210117064Latihan4Kambing {
    
    public void tambahKambing() {
       //Deklarasi Variabel lokal
       int jumlahKambing = 0;
       
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210117064Latihan4Kambing kambingJantan = new PBO210117064Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
