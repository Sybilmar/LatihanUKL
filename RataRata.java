/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rata.rata;

import java.util.Scanner;

/**
 *
 * @author Sybilla Maryam
 */
import java.util.Scanner;
public class RataRata {

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in); 
        int N1, N2, N3;  
    System.out.println("Masukkan Nilai 1 ; ");
    N1 = inputan.nextInt();
    System.out.println("Masukkan Nilai 2 : ");
    N2 = inputan.nextInt();
    System.out.println("Masukkan nilai 3 : ");
    N3 = inputan.nextInt();
     int Total=0;
     Total = N1+N2+N3;
     int Rata_rata;
     Rata_rata = Total/3;
     
     System.out.println("Hasil Rata-rata adalah"+ Rata_rata);
    
    
    }
    
    
    
}
