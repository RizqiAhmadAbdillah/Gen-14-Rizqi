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
 * 1. Buatlah class bidang datar (Persegi, Segitiga, Lingkaran, BelahKetupat)
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
        float phi = 3.14F, jariJari;
        int sisiPersegi, sisiSegitiga1, sisiSegitiga2, sisiSegitiga3, diagonal1, diagonal2;
        int bidangDatar[] = new int[4];
        String shapes[] = {"Persegi", "Segitiga", "Lingkaran", "Diamond"};
        Bidang bidang = new Bidang();

        System.out.println("Program Menghitung Luas & Keliling");
        System.out.println("-----------------------");
        System.out.println("1. Persegi");
        System.out.print("Masukkan sisi persegi: ");
        sisiPersegi = scan.nextInt();
        bidang.setSisiPersegi(sisiPersegi);
        System.out.println("=======================");
        System.out.println("Keliling Persegi: " + bidang.hitungKelilingPersegi(bidang.getSisiPersegi()));
        bidangDatar[0] = bidang.hitungLuasPersegi(bidang.getSisiPersegi());
        System.out.print("Luas Persegi: " + bidangDatar[0] + "\n");

        System.out.println("\n-----------------------");
        System.out.println("2. Segitiga");
        System.out.print("Masukkan sisi segitiga 1: ");
        sisiSegitiga1 = scan.nextInt();
        bidang.setSisiSegitiga1(sisiSegitiga1);
        System.out.print("Masukkan sisi segitiga 2: ");
        sisiSegitiga2 = scan.nextInt();
        bidang.setSisiSegitiga2(sisiSegitiga2);
        System.out.print("Masukkan sisi segitiga 3: ");
        sisiSegitiga3 = scan.nextInt();
        bidang.setSisiSegitiga3(sisiSegitiga3);
        System.out.println("=======================");
        System.out.println("Keliling Segitiga: " + bidang.hitungKelilingSegitiga(bidang.getSisiSegitiga1(), bidang.getSisiSegitiga2(), bidang.getSisiSegitiga3()));
        bidangDatar[1] = bidang.hitungLuasSegitiga(bidang.getSisiSegitiga1(), bidang.getSisiSegitiga2(), bidang.getSisiSegitiga3());
        System.out.print("Luas Segitiga: " + bidangDatar[1] + "\n");

        System.out.println("-----------------------");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        jariJari = scan.nextFloat();
        bidang.setJariJari(jariJari);
        System.out.println("=======================");
        System.out.println("Keliling Lingkaran: " + bidang.hitungKelilingLingkaran(phi, bidang.getJariJari()));
        bidangDatar[2] = (int) bidang.hitungLuasLingkaran(phi, bidang.getJariJari());
        System.out.print("Luas Lingkaran: " + bidangDatar[2] + "\n");

        System.out.println("\n-----------------------");
        System.out.println("4. Diamond");
        System.out.print("Masukkan diagonal 1: ");
        diagonal1 = scan.nextInt();
        bidang.setDiagonal1(diagonal1);
        System.out.print("Masukkan diagonal 2: ");
        diagonal2 = scan.nextInt();
        bidang.setDiagonal2(diagonal2);
        System.out.println("=======================");
        System.out.println("Keliling Diamond: " + bidang.hitungKelilingDiamond(bidang.getDiagonal1(), bidang.getDiagonal2()));
        bidangDatar[3] = bidang.hitungLuasDiamond(bidang.getDiagonal1(), bidang.getDiagonal2());
        System.out.print("Luas Diamond: " + bidangDatar[3] + "\n");

        System.out.println("\n-----------------------");
        System.out.print("Kumpulan Luas Dalam Array: " + Arrays.toString(bidangDatar));
        System.out.println("\n\nMenampilkan array menggunakan looping for");
        for (int i = 0; i < bidangDatar.length; i++) {
            System.out.println("Luas " + shapes[i] + "\t: " + bidangDatar[i]);

        }

//        float value1, value2;
//        String shapes[][] = {
//            {"Persegi Panjang", "Panjang", "Lebar"},
//            {"Segitiga", "Alas", "Tinggi"},
//            {"Lingkaran", "Jari-jari"},
//            {"Diamond", "Diagonal 1", "Diagonal 2"},};
//
//        for (int i = 0; i < shapes.length; i++) {
//            for (int j = 0; j < shapes[i].length; j++) {
//                System.out.println("Program Menghitung Luas");
//                System.out.println("-----------------------");
//                System.out.println("Luas " + shapes[i][j]);
//                System.out.print("Masukkan " + shapes[i][j + 1] + ": ");
//                panjang = scan.nextInt();
//                bidang.setPanjang(panjang);
//                System.out.print("Masukkan " + shapes[i][j + 2] + ": ");
//                lebar = scan.nextInt();
//                bidang.setLebar(lebar);
//                System.out.println("=======================");
//                bidangDatar[0] = bidang.hitungLuasPersegi(bidang.getPanjang(), bidang.getLebar());
//                System.out.print("Luas Persegi Panjang: " + bidangDatar[0] + "\n");
//            }
//        }
    }
}
