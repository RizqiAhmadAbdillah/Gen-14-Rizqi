/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.prodemy.ujicoba;
import java.util.Arrays;

/**
 *
 * @author Rizqi Ahmad Abdillah TUGAS AKHIR PEKAN
 *
 * 1. Buatlah class bidang datar (Segitiga, Persegi, Lingkaran, BelahKetupat)
 * berikut dengan atributnya masing-masing dan jangan lupa setter dan getternya,
 * juga constructornya
 *
 * 2. Buatlah fungsi untuk menghitung luas dan keliling dari masing-masing
 * bidang datar yang telah dibuat.
 *
 * 3. Buat program untuk menampilkan luas dari kumpulan (array) bidang datar
 * yang telah dibuat.
 */
public class Ujicoba {

    private static float phi = 3.14F;
    private static int bidangDatar[] = new int[4];

    public static void main(String[] args) {
        Bidang bidang = new Bidang();
//        Bidang bidang=new Bidang(5, 3, 6, 4, 4, 5, 4);
        System.out.println("Program Menghitung luas");
        System.out.println("-----------------------");
        bidangDatar[0] = bidang.hitungLuasPersegi(5, 3);
        bidangDatar[1] = bidang.hitungLuasSegitiga(6, 4);
        bidangDatar[2] = bidang.hitungLuasLingkaran((int) phi, 4);
        bidangDatar[3] = bidang.hitungLuasDiamond(5, 4);
        
        for (int i = 0; i < bidangDatar.length; i++) {
            System.out.println(Arrays.toString());
        }
    }
}
