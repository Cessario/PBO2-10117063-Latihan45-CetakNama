/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan45.cetaknama;

import java.util.Scanner;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : mencetak nama
 */
public class PBO210117063Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer print = new Printer();
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nama anda : ");
        print.setNama(sc.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(sc.nextInt());
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama() );
    }
    
}
