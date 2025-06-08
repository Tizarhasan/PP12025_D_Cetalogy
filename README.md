# Pencatatan Transaksi Harian - Cetalogy

## Deskripsi Proyek
Proyek ini merupakan aplikasi **console-based** berbasis bahasa pemrograman Java yang dikembangkan sebagai bagian dari Tugas Besar Praktikum Pemrograman 1. Aplikasi ini dirancang untuk membantu pencatatan transaksi harian pada sebuah restoran atau warung makan sederhana.

Struktur data utama yang digunakan adalah **Queue berbasis Node**, dengan prinsip **FIFO (First In First Out)**.

----------

## Fitur Aplikasi

- **Tambah Transaksi (Enqueue)**  
  Menambahkan transaksi baru ke antrian.

- **Lihat Antrian Transaksi**  
  Menampilkan semua transaksi yang sedang mengantri.

- **Proses Transaksi (Dequeue)**  
  Memproses transaksi paling awal (menghapus dari antrian).

- **Lihat Total Pendapatan**  
  Menghitung total pendapatan dari semua transaksi yang telah diproses.

- **Cari Transaksi Berdasarkan Nama**  
  Mencari transaksi berdasarkan nama pelanggan.

----------

## Struktur Proyek
PP12025_D_Cetalogy/
├── src/
│   ├── entity/                               # Berisi kelas-kelas model data transaksi dan node queue
│   │   ├── Node.java
│   │   └── Transaksi.java
│   ├── services/                             # Berisi kelas yang mengelola logika struktur data Queue
│   │   └── StrukturQueue.java
│   └── MainApp.java                          # Kelas utama tempat program dijalankan dan antarmuka konsol dikelola
├── docs/                                     # Berisi dokumentasi proyek, laporan, dan diagram
│   └── laporan_tugas_besar.pdf
├── README.md                                 # Panduan umum mengenai proyek dan cara menjalankannya

----------

## Kontributor
- **Ketua**  
  Tyezar Hasan Khusaeni (233040029)

- **Anggota**  
  Kresna Satria Dewantoro (233040001)
  Aqillah Lean Andera (233040017)
  Moch Sachrul Akbar R (233040036)