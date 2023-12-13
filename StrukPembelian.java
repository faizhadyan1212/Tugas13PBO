import java.time.format.DateTimeFormatter;

class StrukPembelian extends Transaksi {

    public StrukPembelian(Pelanggan pelanggan, Barang barang, String namaKasir) {
        super(pelanggan, barang, namaKasir);
    }

    @Override
    public void tampilkanStruk() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        final String tanggalJamPembelian = getWaktuPembelian().format(formatter);
        System.out.println("\t ===== Struk  Astral Mart =====");
        System.out.println("Tanggal Pembelian: " + tanggalJamPembelian.substring(0, 10));
        System.out.println("Waktu Pembelian: " + tanggalJamPembelian.substring(11));
        System.out.println("===============================");
        System.out.println("\nData Pelanggan:");
        System.out.println("-------------------------------");
        System.out.println("Nama Pelanggan: " + getPelanggan().getNamaPelanggan());
        System.out.println("Nomor HP: " + getPelanggan().getNomorHP());
        System.out.println("Alamat: " + getPelanggan().getAlamat());
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("\nData Pembelian Barang:");
        System.out.println("-------------------------------");
        System.out.println("Kode Barang: " + getBarang().getKodeBarang());
        System.out.println("Nama Barang: " + getBarang().getNamaBarang());
        System.out.println("Harga Barang: " + getBarang().getHarga());
        System.out.println("Jumlah Beli: " + getBarang().getJumlahBeli());
        System.out.println("Total Bayar: " + hitungTotalBayar());
        System.out.println("\nNama Kasir: Faiz Hadyan ");
        System.out.println("===============================");

        System.out.println("toUpperCase\t: " + getPelanggan().getNamaPelanggan().toUpperCase());
    }
}