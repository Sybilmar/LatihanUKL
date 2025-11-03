/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.volumetabung;

/**
 *
 * @author Sybilla Maryam
 */
import java.util.Scanner;
public class VolumeTabung {

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        int VolumeT, Phi, Jarij, TinggiT;
        System.out.print("Masukkan Jari-jari : ");
        Jarij = inputan.nextInt();
        System.out.print("Masukkan Phi : ");
        Phi = inputan.nextInt();
        System.out.print("Masukkan Tinggi tabung : ");
        TinggiT = inputan.nextInt();
        VolumeT = Phi*Jarij*TinggiT;
        System.out.println("Volume Tabung adalah"+ VolumeT);
      
    }
}
