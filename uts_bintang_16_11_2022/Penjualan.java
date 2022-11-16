/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_bintang_16_11_2022;

/**
 *
 * @author lenovo
 */
class Penjualan {
    private String noFaktur;
    private String tanggal;
    private String namaPelanggan;
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    private double diskon;
    private double pajak;
    private double totalBayar;

    

    public String getNoFaktur() {
        return noFaktur;
    }

    public String getTanggal() {
        return tanggal;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public double getDiskon() {
        return diskon;
    }
    
    public double getPajak() {
        return pajak;
    }
    
    public double getTotalBayar() {
        return totalBayar;
    }

    public void setNilai(String NoFaktur,String Tanggal, String NamaPelanggan, String NamaBarang, int HargaBarang, int JumlahBarang, double Diskon, double Pajak, double TotalBayar) {
        this.noFaktur = NoFaktur;
        this.tanggal = Tanggal;
        this.namaPelanggan = NamaPelanggan;
        this.namaBarang = NamaBarang;
        this.hargaBarang = HargaBarang;
        this.jumlahBarang = JumlahBarang ;
        this.diskon = Diskon;
        this.pajak = Pajak;
        this.totalBayar = TotalBayar;
    }

    void setNilai(String noFaktur, String namaPelanggan, String namaBarang, int hargaBarang, int jumlahBarang, double diskon, double pajak, double totalBayar) {

    }

}
