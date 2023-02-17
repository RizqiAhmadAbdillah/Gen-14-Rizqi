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

    private int panjang, lebar, alas, tinggi, jariJari, diagonal1, diagonal2;
    
    public Bidang(){}
    
    public Bidang(int panjang, int lebar, int alas, int tinggi, int jariJari, int diagonal1, int diagonal2) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.alas = alas;
        this.tinggi = tinggi;
        this.jariJari = jariJari;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getJariJari() {
        return jariJari;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public int hitungLuasPersegi(int p, int l) {
        return p * l;
    }

    public int hitungLuasSegitiga(int a, int t) {
        return a * t;
    }

    public int hitungLuasLingkaran(int phi, int r) {
        return phi * r * r;
    }

    public int hitungLuasDiamond(int d1, int d2) {
        return d1 * d2;
    }

}
