/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamassigment1bad;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class ArrayProgramming {

    public static void main(String[] args) {
        
        System.out.println("=========================================");
        System.out.println("==== Selamat Datang di Program Array ====");
        System.out.println("=========================================");
        System.out.println(" ");
        int jumlahArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Array :   ");
        jumlahArray = scanner.nextInt();
        System.out.println(" ");
        
        // Inisialisasi array dengan limit 100 nilai array
        int[] array = new int[100];
        System.out.println("Masukkan Bilangan Pada Array ");
        int angka = 1;
        
        // Perulangan input nilai array sesuai dengan jumlah yang diinputkan
        for (int i = 0; i < jumlahArray; i++) {
            System.out.print("Jumlah Bilangan Ke-" + angka + ":  ");
            angka++;
            array[i] = scanner.nextInt();
        }
        
        // Operasi untuk menentukan nilai terbesar dari array yang sudah diinputkan
        int max_num = array[0];
        for (int i = 0; i < jumlahArray; i++) {
            if (array[i] > max_num) {
                max_num = array[i];
            }
        }
        
        // Operasi untuk menentukan nilai terkecil dari array yang sudah diinputkan
        int min_num = array[0];
        for (int i = 0; i < jumlahArray; i++) {
            if (array[i] < min_num) {
                min_num = array[i];
            }
        }
        
        // Operasi untuk menentukan rata-rata berdasarkan input array yang diinputkan
        int totalArray = 0;
        for (int i = 0; i < jumlahArray; i++) {
            totalArray = totalArray+array[i];
        }
        int ratarata = totalArray/jumlahArray;
        
        System.out.println(" ");
        System.out.println("Bilangan Terbesar adalah : " + max_num);
        System.out.println("Bilangan Terkecil adalah : " + min_num);
        System.out.println("Rata-Rata Bilangan adalah : " + ratarata);
    }
}
