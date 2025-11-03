/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ganjilgenap;

/**
 *
 * @author Sybilla Maryam
 */
import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan :");
        bilangan = inputan.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap");
            System.out.println("Bilagan bisa dibagi 2");
        } else {
            System.out.println("Bilangan ganjil");
            System.out.println("Bilangan tidak bisa" + " dibagi 2");
            System.out.println("Karena hasil dibagi = sisa 1");
        }
    }
}
