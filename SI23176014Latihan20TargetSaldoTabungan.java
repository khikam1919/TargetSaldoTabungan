/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan20.targetsaldotabungan;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini berisi untuk menghitung pertumbuhan saldo tabungan 
 * dengan bunga 8% per bulan hingga mencapai saldo target Rp. 6.000.000
 */
public class SI23176014Latihan20TargetSaldoTabungan {
   public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 3500000; // Saldo awal sebesar Rp. 3.500.000
        double bunga = 0.08; // Bunga per bulan sebesar 8%
        double saldoTarget = 6000000; // Saldo target sebesar Rp. 6.000.000
        int bulan = 1; // Inisialisasi bulan

        // Perulangan sampai saldo mencapai atau melebihi saldo target
        while (saldoAwal < saldoTarget) {
            // Hitung saldo bulan berikutnya dengan menambahkan bunga
            saldoAwal += saldoAwal * bunga;

            // Tampilkan saldo per bulan
            System.out.printf("Saldo di bulan ke-%d Rp. %.0f\n", bulan, saldoAwal);

            // Tambahkan jumlah bulan
            bulan++;
        }
    }
}