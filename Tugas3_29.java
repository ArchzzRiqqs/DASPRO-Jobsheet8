
import java.util.Scanner;

public class Tugas3_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        }

        int totalBarangSeluruhToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;

            System.out.print("Masukkan jumlah pelanggan Toko " + toko + ": ");
            jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif.");
                System.out.print("Masukkan jumlah pelanggan Toko " + toko + ": ");
                jumlahPelanggan = sc.nextInt();
            }

            int totalBarangToko = 0;

            for (int pelanggan = 1;
                pelanggan <= jumlahPelanggan;
                pelanggan++) {

                int jumlahBarang;

                System.out.print("Jumlah barang pelanggan " + pelanggan + " di Toko " + toko + ": ");
                jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0) {
                    System.out.println("Jumlah barang tidak boleh negatif.");
                    System.out.print("Jumlah barang pelanggan " + pelanggan + " di Toko " + toko + ": ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
