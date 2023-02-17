/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.prodemy.ujicoba;

import java.util.Arrays;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String shapes[][] = {
//            {"Persegi Panjang", "Panjang", "Lebar"},
//            {"Segitiga", "Alas", "Tinggi"},
//            {"Lingkaran", "Jari-jari"},
//            {"Diamond", "Diagonal 1", "Diagonal 2"},};
        float phi = 3.14F, jariJari;
        int panjang, lebar, alas, tinggi, diagonal1, diagonal2;
        int bidangDatar[] = new int[4];
        Bidang bidang = new Bidang();

        System.out.println("Program Menghitung Luas");
        System.out.println("-----------------------");
        System.out.println("Luas Persegi Panjang");
        System.out.print("Masukkan panjang: ");
        panjang = scan.nextInt();
        bidang.setPanjang(panjang);
        System.out.print("Masukkan lebar: ");
        lebar = scan.nextInt();
        bidang.setLebar(lebar);
        System.out.println("=======================");
        bidangDatar[0] = bidang.hitungLuasPersegi(bidang.getPanjang(), bidang.getLebar());
        System.out.print("Luas Persegi Panjang: " + bidangDatar[0] + "\n");

        System.out.println("\n-----------------------");
        System.out.println("Luas Segitiga");
        System.out.print("Masukkan alas: ");
        alas = scan.nextInt();
        bidang.setAlas(alas);
        System.out.print("Masukkan tinggi: ");
        tinggi = scan.nextInt();
        bidang.setTinggi(tinggi);
        System.out.println("\n-----------------------");
        bidangDatar[1] = bidang.hitungLuasSegitiga(bidang.getAlas(), bidang.getTinggi());
        System.out.print("Luas Segitiga: " + bidangDatar[1] + "\n");

        System.out.println("-----------------------");
        System.out.println("Luas Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        jariJari = scan.nextFloat();
        bidang.setJariJari(jariJari);
        System.out.println("=======================");
        bidangDatar[2] = (int) bidang.hitungLuasLingkaran(phi, bidang.getJariJari());
        System.out.print("Luas Lingkaran: " + bidangDatar[2] + "\n");

        System.out.println("\n-----------------------");
        System.out.println("Luas Diamond");
        System.out.print("Masukkan diagonal 1: ");
        diagonal1 = scan.nextInt();
        bidang.setDiagonal1(diagonal1);
        System.out.print("Masukkan diagonal 2: ");
        diagonal2 = scan.nextInt();
        bidang.setDiagonal2(diagonal2);
        System.out.println("=======================");
        bidangDatar[3] = bidang.hitungLuasDiamond(bidang.getDiagonal1(), bidang.getDiagonal2());
        System.out.print("Luas Diamond: " + bidangDatar[3] + "\n");
        
        System.out.println("\n-----------------------");
        System.out.print("Kumpulan Luas Dalam Array: "+ Arrays.toString(bidangDatar));
        
    }
}
