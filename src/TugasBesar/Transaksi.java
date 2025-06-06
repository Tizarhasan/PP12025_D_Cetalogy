package TugasBesar;

public class Transaksi {
    private String namaPelanggan;
    private String namaMenu;
    private int jumlah;
    private int hargaSatuan;
    private int totalHarga;

    public Transaksi(String namaPelanggan, String namaMenu, int jumlah, int hargaSatuan) {
        this.namaPelanggan = namaPelanggan;
        this.namaMenu = namaMenu;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.totalHarga = jumlah * hargaSatuan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Menu: " + namaMenu);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Total Harga: " + totalHarga);
    }
}
