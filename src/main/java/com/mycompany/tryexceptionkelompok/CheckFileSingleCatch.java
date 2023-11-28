/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tryexceptionkelompok;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class CheckFileSingleCatch {
    
    public String bacaFile(String namaFile){
        File file = new File(namaFile);
        Scanner scanner = null;
        // Membuat variabel untuk menyimpan data yang dibaca
        String data = null;
        
        try {
            scanner = new Scanner(file);
            data = scanner.nextLine();
            
        } catch (FileNotFoundException e) {
            System.out.println("File " + namaFile + " tidak ditemukan");
            return null;
            
        }
        
        if (scanner != null) {
            scanner.close();
        }
        
        return data;
    }
}
