

import entity.Transaksi;
import java.util.Scanner;
import services.StrukturQueue;

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

            int pilihan = 0;
            while (true) {
                System.out.print("Pilih menu: ");
                try {
                    pilihan = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                }
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Nama pelanggan: ");
                    String nama = scanner.nextLine();
                    Transaksi transaksi = new Transaksi(nama);

                    boolean tambahMenu = true;
                    while (tambahMenu) {
                        System.out.print("Nama menu: ");
                        String menu = scanner.nextLine();

                        int jumlah = 0;
                        while (true) {
                            System.out.print("Jumlah pesanan: ");
                            try {
                                jumlah = Integer.parseInt(scanner.nextLine());
                                if (jumlah > 0) break;
                                else System.out.println("Jumlah harus lebih dari 0.");
                            } catch (NumberFormatException e) {
                                System.out.println("Input tidak valid. Masukkan angka yang benar.");
                            }
                        }

                        int harga = 0;
                        while (true) {
                            System.out.print("Harga satuan: ");
                            try {
                                harga = Integer.parseInt(scanner.nextLine());
                                if (harga >= 0) break;
                                else System.out.println("Harga tidak boleh kurang dari 0.");
                            } catch (NumberFormatException e) {
                                System.out.println("Input tidak valid. Masukkan angka yang benar.");
                            }
                        }

                        transaksi.tambahMenu(menu, jumlah, harga);

                        System.out.print("Tambah menu lagi? (y/n): ");
                        String lagi = scanner.nextLine();
                        if (!lagi.equalsIgnoreCase("y")) {
                            tambahMenu = false;
                        }
                    }

                    queue.enqueue(transaksi);
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
