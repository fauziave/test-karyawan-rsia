/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anorium.test1.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Fauzi-EDP
 */
@ManagedBean
@ViewScoped
public class Soal2Controller{
    
    @PostConstruct
    public void init() {
         soal2 = new StringBuilder()
                .append("Pertanyaan :\n ")
                .append("Benahi program dengan ketentuan sebagai berikut:\n")
                .append("1. program hitung keliling ketika di klik akan menampilkan hasil di text hasil keliling\n")
                .append("2. program luas segitiga ketika di klik akan menampilkan hasil di text hasil luas")
                .toString();
        panjang = "";
        lebar = 0;
        keliling = "hasil keliling";
        alas="";
        tinggi="";
        luas="hasil luas";
    }
    private String soal2;
    private String panjang;
    private int lebar;
    private String keliling;
    private String alas;
    private String tinggi;
    private String luas;

    public String getSoal2() {
        return soal2;
    }

    public String getPanjang() {
        return panjang;
    }

    public void setPanjang(String panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public String getKeliling() {
        return keliling;
    }

    public void setKeliling(String keliling) {
        this.keliling = keliling;
    }
 
    public void hitungKeliling(){
        //buat rumus hitung keliling = panjang * lebar
        //hint pastikan type string harus diubah dulu ke integer
        keliling = "";
    }

    public String getAlas() {
        return alas;
    }    

    public String getTinggi() {
        return tinggi;
    }

    public String getLuas() {
        return luas;
    }
    
    public void hitungLuas(){
        //buat rumus luas = 1/2 * alas * tinggi
        //hint gunakan variabel angka yang dapat menerima nilai desimal
        luas = "";
    }
}
