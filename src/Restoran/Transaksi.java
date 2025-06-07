package Restoran;

import java.util.ArrayList;

public class Transaksi {
    private String namaPelanggan;
    private ArrayList<String> daftarMenu;
    private ArrayList<Integer> jumlah;
    private ArrayList<Integer> hargaSatuan;
    private int totalHarga;

    public Transaksi(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
        this.daftarMenu = new ArrayList<>();
        this.jumlah = new ArrayList<>();
        this.hargaSatuan = new ArrayList<>();
        this.totalHarga = 0;
    }

    public void tambahMenu(String menu, int jumlahPesanan, int harga) {
        daftarMenu.add(menu);
        jumlah.add(jumlahPesanan);
        hargaSatuan.add(harga);
        totalHarga += jumlahPesanan * harga;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.println("- " + daftarMenu.get(i) + " | Jumlah: " + jumlah.get(i) + " | Harga Satuan: " + hargaSatuan.get(i));
        }
        System.out.println("Total Harga: " + totalHarga);
    }
}
