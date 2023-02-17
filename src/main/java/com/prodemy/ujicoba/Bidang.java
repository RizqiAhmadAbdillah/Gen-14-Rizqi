/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prodemy.ujicoba;

/**
 *
 * @author Rizqi Ahmad Abdillah
 */
public class Bidang {

    private float jariJari;
    private int sisiPersegi, sisiSegitiga1, sisiSegitiga2, sisiSegitiga3, diagonal1, diagonal2;

    public Bidang() {
    }

    public Bidang(float jariJari, int sisiPersegi, int sisiSegitiga1, int sisiSegitiga2, int sisiSegitiga3, int diagonal1, int diagonal2) {
        this.jariJari = jariJari;
        this.sisiPersegi = sisiPersegi;
        this.sisiSegitiga1 = sisiSegitiga1;
        this.sisiSegitiga2 = sisiSegitiga2;
        this.sisiSegitiga3 = sisiSegitiga3;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public void setSisiPersegi(int sisiPersegi) {
        this.sisiPersegi = sisiPersegi;
    }

    public void setSisiSegitiga1(int sisiSegitiga1) {
        this.sisiSegitiga1 = sisiSegitiga1;
    }

    public void setSisiSegitiga2(int sisiSegitiga2) {
        this.sisiSegitiga2 = sisiSegitiga2;
    }

    public void setSisiSegitiga3(int sisiSegitiga3) {
        this.sisiSegitiga3 = sisiSegitiga3;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public float getJariJari() {
        return jariJari;
    }

    public int getSisiPersegi() {
        return sisiPersegi;
    }

    public int getSisiSegitiga1() {
        return sisiSegitiga1;
    }

    public int getSisiSegitiga2() {
        return sisiSegitiga2;
    }

    public int getSisiSegitiga3() {
        return sisiSegitiga3;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

//    HITUNG KELILING-----------
    public int hitungKelilingPersegi(int s) {
        return s * 4;
    }

    public int hitungKelilingSegitiga(int a, int b, int c) {
        return a + b + c;
    }

    public float hitungKelilingLingkaran(float phi, float r) {
        return phi * 2 * r;
    }

    public int hitungKelilingDiamond(int d1, int d2) {
        int x = d1 / 2;
        int y = d2 / 2;
        return (int) Math.sqrt((x * x) + (y * y)) * 4;
    }

//    HITUNG LUAS------------------
    public int hitungLuasPersegi(int s) {
        return s * s;
    }

    public int hitungLuasSegitiga(int a, int b, int c) {
        int luas, tinggi;
//        jika segitiga sama sisi
        if (a == b) {
            tinggi = (int) Math.sqrt((a * a) - (c / 2) * (c / 2));
            luas = c * tinggi / 2;
        } else if (b == c) {
            tinggi = (int) Math.sqrt((b * b) - (a / 2) * (a / 2));
            luas = a * tinggi / 2;
        } else if (a == c) {
            tinggi = (int) Math.sqrt((c * c) - (b / 2) * (b / 2));
            luas = b * tinggi / 2;
//        jika segitiga siku-siku
        } else if (a * a == b * b + c * c) {
            luas = b * c / 2;
        } else if (b * b == a * a + c * c) {
            luas = a * c / 2;
        } else if (c * c == a * a + b * b) {
            luas = a * b / 2;
        } else {
//        jika segitiga sembarang
            int s = (a + b + c) / 2;
            luas = (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return luas;
    }

    public float hitungLuasLingkaran(float phi, float r) {
        return phi * r * r;
    }

    public int hitungLuasDiamond(int d1, int d2) {
        return d1 * d2 / 2;
    }

}
