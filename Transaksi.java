// Antarmuka Pembayaran

import java.time.LocalDateTime;

interface Pembayaran {
    double hitungTotalBayar();
}

// Kelas abstrak untuk transaksi
abstract class Transaksi implements Pembayaran {
    private LocalDateTime waktuPembelian;
    private Pelanggan pelanggan;
    private Barang barang;
    private String namaKasir;

    public Transaksi(Pelanggan pelanggan, Barang barang, String namaKasir) {
        this.waktuPembelian = LocalDateTime.now();
        this.pelanggan = pelanggan;
        this.barang = barang;
        this.namaKasir = namaKasir;
    }

    public abstract void tampilkanStruk();

    @Override
    public double hitungTotalBayar() {
        return barang.getHarga() * barang.getJumlahBeli();
    }

    public LocalDateTime getWaktuPembelian() {
        return waktuPembelian;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Barang getBarang() {
        return barang;
    }

    public String getNamaKasir() {
        return namaKasir;
    }
}