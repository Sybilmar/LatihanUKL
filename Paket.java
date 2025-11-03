/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.paket;

/**
 *
 * @author Sybilla Maryam
 */
import java.util.Scanner;

public class Paket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jarak;
        double biayaPerKg = 0;
        double volume;
        double biaya;
        double pengiriman;
//        String biayaPerKg;

        System.out.print("Masukkan berat paket (kg) ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km)");
        jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm)");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm)");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm)");
        double tinggi = input.nextDouble();

        //volume paket
        volume = panjang * lebar * tinggi;

        //Biaya berdasarkan jarak
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        //Biaya berdaasarkan berat
        double biayaPengiriman = berat * biayaPerKg;

        //Berdasarkan volume
        double biayaTambahan = 0;
        if (volume > 100) {
            biayaTambahan = 50000;
        }

        //Total biaya
        double totalbiaya = biayaPengiriman + biayaTambahan;

        System.out.println("Rincian Pengiriman Paket");
        System.out.println("volume paket  :" + volume + "cm^3");
        System.out.println("Biaya per Kg : Rp " + biayaPerKg);
        System.out.println("Biaya Pengiriman : Rpk " + biayaPengiriman);
        System.out.println("Biaya tambahan : Rp " + biayaTambahan);
        System.out.println("----");
        System.out.println("Total biaya kirim : Rp" + totalbiaya);

//        input.close();
    }
}
