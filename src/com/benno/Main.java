package com.benno;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung jari-jari, luas, dan keliling lingkaran
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat satuan = new DecimalFormat();
        double diameter, jariJari, Phi, kllLingkaran, luasLingkaran;
        Phi = Math.PI;

        System.out.println("====Perhitungan Lingkaran====");
        System.out.print("Masukkan nilai diameter lingkaran : ");

        while (true) {
            try {
                diameter = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {

                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println();

                System.out.print("Masukkan nilai diameter lingkaran : ");
                scanner.nextLine();
            }
        }

        jariJari = diameter / 2;
        kllLingkaran = diameter * Phi;
        luasLingkaran = Phi * (jariJari * jariJari);

        System.out.println("====Hasil Perhitungan Lingkaran====");

        System.out.println("Jari-jari Lingkaran = " + jariJari);
        System.out.println("Luas Lingkaran = " + satuan.format(luasLingkaran));
        System.out.println("Keliling Lingkaran = " + satuan.format(kllLingkaran));

    }

}
