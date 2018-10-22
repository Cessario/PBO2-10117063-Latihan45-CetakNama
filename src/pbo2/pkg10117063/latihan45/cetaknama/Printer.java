/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan45.cetaknama;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : mencetak nama
 */
public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetak(String nama){
        System.out.println("Nama Anda : " +nama);
        
    }
    public void cetak (int jmlCetak,String nama){
        int i = 1;
        System.out.println("Hasil Cetak : ");
        do
        {  
            
            System.out.println(i+ ". " +nama);i++;
            
        }
       while(i<=jmlCetak) ;
    }
}
