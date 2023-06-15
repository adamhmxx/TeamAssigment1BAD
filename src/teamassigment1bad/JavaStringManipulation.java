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
public class JavaStringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==========================================================");
        System.out.println("==== Selamat Datang di Program Manipulasi String Java ====");
        System.out.println("==========================================================");
        System.out.println(" ");
        
        System.out.print("Masukkan String A :  ");
        String A = scanner.nextLine();
        System.out.print("Masukkan String B :  ");
        String B = scanner.nextLine();
        
        // Merubah huruf kecil menjadi huruf besar dan merubah huruf besar menjadi huruf kecil
        String besarKecilA = besarKecil(A);
        String besarKecilB = besarKecil(B);
        
        System.out.println("String A : " + besarKecilA);
        System.out.println("String B : " + besarKecilB);
        
        // menghitung jumlah huruf (tanpa spasi)
        int hitungA = HitungKata(A);
        int hitungB = HitungKata(B);
        
        System.out.println("Jumlah huruf String A : " + hitungA);
        System.out.println("Jumlah huruf String B : " + hitungB);
        
        // menggabungkan String A dan Streing b dengan menyisipkan tanda koma dan spasi (", ") di antara kalimatnya
        String gabungKalimat = A + ", " + B;
        
        System.out.println("Hasil Menggabungkan Kalimat : " + gabungKalimat);
        
        // membalik kalimat pada String A dan String B
        String balikA = balikKata(A);
        String balikB = balikKata(B);
        
        System.out.println("Hasil pembalikan kalimat A : " + balikA);
        System.out.println("Hasil pembalikan kalimat B : " + balikB);
        
        scanner.close();

    }
    
    // Method untuk mengubah huruf besar ke huruf kecil dan huruf kecil ke huruf besar
    public static String besarKecil(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
    
    // Method untuk operasi menghitung karakter pada setiap kata
    public static int HitungKata(String string){
        int hitung = 0;
        
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetter(c)) {
                hitung++;
            }
        }
        return hitung;
    }
    
    // Method untuk operasi membalikkan kata dari belakang
    public static String balikKata(String string){
        StringBuilder result = new StringBuilder();
        
        for (int i = string.length() - 1;i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }
}
