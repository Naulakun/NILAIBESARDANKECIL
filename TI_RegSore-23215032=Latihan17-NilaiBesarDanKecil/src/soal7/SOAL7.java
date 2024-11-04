/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal7;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : NILAI TERBESAR DAN TERKECIL
 */
import java.util.Scanner;

public class SOAL7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama pengawas
        System.out.println("=== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa === ");
        System.out.print("Masukkan nama Petugas: ");
        String namaPetugas = scanner.nextLine();

        // Array untuk menyimpan 6 nilai
        int[] nilai = new int[6];

        // Mengambil input 6 nilai dari pengguna
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        // Menentukan nilai terbesar dan terkecil
        int nilaiTerbesar = nilai[0];
        int nilaiTerkecil = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > nilaiTerbesar) {
                nilaiTerbesar = nilai[i];
            }
            if (nilai[i] < nilaiTerkecil) {
                nilaiTerkecil = nilai[i];
            }
        }

        // Menampilkan hasil
       System.out.println("\n ===Hasil Nilai Mahasiswa===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        
        System.out.println("Nilai Terbesar: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil: " + nilaiTerkecil);
        
        System.out.println("Nama Petugas: " + namaPetugas);

        // Menutup scanner
        scanner.close();
    }
}
