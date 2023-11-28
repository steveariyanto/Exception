/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tryexceptionkelompok;

/**
 *
 * @author User
 */
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String gudang;
    private double hargaBeli;
    private double hargaJual;
    
    public Barang(String kodeBarang, String namaBarang, String gudang, double hargaBeli, double hargaJual){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.gudang = gudang;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }
    
    public void beliBarang(int jml_barang){
        try{
            if(jml_barang < 1){
                throw new MyException("Jumlah barang beli minimal harus 1.");
            }
            
            if(hargaJual < 0){
                throw new MyException("Harga jual barang tidak sesuai.");
            }
            
            System.out.println("Anda berhasil belanja " + namaBarang);
            
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
