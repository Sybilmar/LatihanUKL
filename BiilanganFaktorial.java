/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biilanganfaktorial;

/**
 *
 * @author Sybilla Maryam
 */
import java.util.Scanner;
public class BiilanganFaktorial {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int Nilai=0;
        System.out.println("Masukkan nilai :");
        Nilai = inputan.nextInt(); 
        int Hasil=1;
        int Faktorial=Nilai;
        while (Faktorial >=1 ){
            Hasil *= Faktorial;
            System.out.println("faktor ke - "+Faktorial);
            Faktorial--;
        
        }
        System.out.println("Faktorial dari." + Nilai + ".adalah." + Hasil);
        
            
        
    }
}
