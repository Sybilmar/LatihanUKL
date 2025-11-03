/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matrix;

/**
 *
 * @author Sybilla Maryam
 */
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int nilai = 90;
        int[] M1 = {5, 6, 7, 1, 3};
        int[] M2 = {4, 3, 1, 5, 7};
        int[] M3 = {0,0,0,0,0};

        int a = 0;
        while (a < 5) {
            M3[a] = M1[a] + M2[a];
            a++;

        }
        System.out.print("M1 = ");
        for (int i = 0; i < 5; i++){
            System.out.print(M1[i] + "");
        }
        System.out.print("M2 = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(M2[i] + "");
   
        }
        System.out.print("Hasil penjumlahan (M3) = ");
        for (int i = 0; i < 5; i++){
            System.out.print(M3[1] + "");
        
        }
        
        
        
        
        
        

    }
}
