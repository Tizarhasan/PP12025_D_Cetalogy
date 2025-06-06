package App;

import Restoran.StrukturQueue;
import Restoran.Transaksi;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StrukturQueue queue = new StrukturQueue();

        int totalPendapatan = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n=== APLIKASI PENCATATAN TRANSAKSI RESTORAN ===");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Lihat Antrian Transaksi");
            System.out.println("3. Proses Transaksi");
            System.out.println("4. Lihat Total Pendapatan");
            System.out.println("5. Cari Transaksi Berdasarkan Nama Pelanggan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Nama menu: ");
                    String menu = scanner.nextLine();
                    System.out.print("Jumlah pesanan: ");
                    int jumlah = scanner.nextInt();
                    System.out.print("Harga satuan: ");
                    int harga = scanner.nextInt();
                    scanner.nextLine(); // Buang newline

                    Transaksi t = new Transaksi(nama, menu, jumlah, harga);
                    queue.enqueue(t);
                    System.out.println("Transaksi berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n== Daftar Antrian Transaksi ==");
                    queue.displayQueue();
                    break;

                case 3:
                    Transaksi diproses = queue.dequeue();
                    if (diproses != null) {
                        System.out.println("Transaksi diproses:");
                        diproses.tampilkanInfo();
                        totalPendapatan += diproses.getTotalHarga();
                    } else {
                        System.out.println("Tidak ada transaksi untuk diproses.");
                    }
                    break;

                case 4:
                    System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);
                    break;

                case 5:
                    System.out.print("Masukkan nama pelanggan yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    queue.cariTransaksi(namaCari);
                    break;

                case 6:
                    System.out.println("Program selesai. Terima kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
