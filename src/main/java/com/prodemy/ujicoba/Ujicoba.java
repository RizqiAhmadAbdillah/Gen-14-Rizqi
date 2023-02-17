/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.prodemy.ujicoba;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rizqi Ahmad Abdillah
 *
 * TUGAS AKHIR PEKAN
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
        int[] kelilingBidangDatar = new int[4];
        int[] luasBidangDatar = new int[4];
        String shapes[] = {"Persegi", "Segitiga", "Lingkaran", "Diamond"};
        Bidang bidang = new Bidang();

        System.out.println("Program Menghitung Luas & Keliling");
        System.out.println("-----------------------");
        System.out.println("1. Persegi");
        System.out.print("Masukkan sisi persegi: ");
        sisiPersegi = scan.nextInt();
        bidang.setSisiPersegi(sisiPersegi);
        System.out.println("=======================");
        kelilingBidangDatar[0] = bidang.hitungKelilingPersegi(bidang.getSisiPersegi());
        System.out.printf("Keliling Persegi: " + kelilingBidangDatar[0] + "\n");
        luasBidangDatar[0] = bidang.hitungLuasPersegi(bidang.getSisiPersegi());
        System.out.print("Luas Persegi: " + luasBidangDatar[0] + "\n");

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
        kelilingBidangDatar[1] = bidang.hitungKelilingSegitiga(bidang.getSisiSegitiga1(), bidang.getSisiSegitiga2(), bidang.getSisiSegitiga3());
        System.out.print("Keliling Segitiga: " + kelilingBidangDatar[1] + "\n");
        luasBidangDatar[1] = bidang.hitungLuasSegitiga(bidang.getSisiSegitiga1(), bidang.getSisiSegitiga2(), bidang.getSisiSegitiga3());
        System.out.print("Luas Segitiga: " + luasBidangDatar[1] + "\n");

        System.out.println("\n-----------------------");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        jariJari = scan.nextFloat();
        bidang.setJariJari(jariJari);
        System.out.println("=======================");
        kelilingBidangDatar[2] = (int) bidang.hitungKelilingLingkaran(phi, bidang.getJariJari());
        System.out.print("Keliling Lingkaran: " + kelilingBidangDatar[2] + "\n");
        luasBidangDatar[2] = (int) bidang.hitungLuasLingkaran(phi, bidang.getJariJari());
        System.out.print("Luas Lingkaran: " + luasBidangDatar[2] + "\n");

        System.out.println("\n-----------------------");
        System.out.println("4. Diamond");
        System.out.print("Masukkan diagonal 1: ");
        diagonal1 = scan.nextInt();
        bidang.setDiagonal1(diagonal1);
        System.out.print("Masukkan diagonal 2: ");
        diagonal2 = scan.nextInt();
        bidang.setDiagonal2(diagonal2);
        System.out.println("=======================");
        kelilingBidangDatar[3] = bidang.hitungKelilingDiamond(bidang.getDiagonal1(), bidang.getDiagonal2());
        System.out.print("Keliling Diamond: " + kelilingBidangDatar[3] + "\n");
        luasBidangDatar[3] = bidang.hitungLuasDiamond(bidang.getDiagonal1(), bidang.getDiagonal2());
        System.out.print("Luas Diamond: " + luasBidangDatar[3] + "\n");

        System.out.println("\n-----------------------");
        System.out.print("\nKumpulan Keliling Dalam Array:\t" + Arrays.toString(kelilingBidangDatar));
        System.out.print("\nKumpulan Luas Dalam Array:\t" + Arrays.toString(luasBidangDatar));
        System.out.println("\n\nMenampilkan array keliling menggunakan looping for");
        for (int i = 0; i < kelilingBidangDatar.length; i++) {
            System.out.println("Keliling " + shapes[i] + "\t: " + kelilingBidangDatar[i]);
        }
        System.out.println("\nMenampilkan array luas menggunakan looping for");
        for (int i = 0; i < luasBidangDatar.length; i++) {
            System.out.println("Luas " + shapes[i] + "\t: " + luasBidangDatar[i]);            
        }
    }

//    public void printData() {
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
//    }
}
