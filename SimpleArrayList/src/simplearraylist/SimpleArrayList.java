/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;

/**
 *
 * @author Predator
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        ProgramArrayList pal = new ProgramArrayList();
        while(true){
            int inp;
            System.out.println("---- Program Pythagoras ----");
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.print("Pilih Nomor Berapa : ");
            inp = input.nextInt();
            switch (inp) {
                case 1:
                    pal.tambahData();
                    break;
                case 2:
                    pal.cariData();
                    break;
                case 3:
                    pal.hapusData();
                    break;
                case 4:
                    pal.showData();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    
}