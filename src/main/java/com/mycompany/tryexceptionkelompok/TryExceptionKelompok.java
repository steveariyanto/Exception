/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tryexceptionkelompok;

/**
 *
 * @author User
 */
public class TryExceptionKelompok {

    public static void main(String[] args) {
//        Barang barang = new Barang("B001", "Barang1", "Gudang Melati", 1200.0, 12000.0);
//        barang.beliBarang(2);
//        CheckFileSingleCatch checkFile = new CheckFileSingleCatch();
//        checkFile.bacaFile("CobaCari.pdf");
        CheckFileMultipleCatch checkFile = new CheckFileMultipleCatch();
        checkFile.bacaFile("Coba cari PDF");
    }
}
