/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  :10119040
 * Kelas: IF1
 * Program menghitung dan menampilkan umur dengan metode
 * pendekatan berbasis objek
 */
public class IF110119040Latihan46TandanyaKamu {

    private static int umur;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int yearnow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearnow);
        System.out.println("masukkan tahun lahir anda :");
        age.setYearbirth( scanner.nextInt());
        System.out.println("==========hasil perhitungan umur============");
        System.out.println("tahun lahir anda: "+age.getYearbirth());
        System.out.println("hari ini tahun: "+age.getYearnow());
        System.out.println("umur kamu samapai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("tandanya kamu "+age.tandanyakamu(umur));
    }
    
}
