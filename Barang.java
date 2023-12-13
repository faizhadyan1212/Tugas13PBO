class Barang {
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int jumlahBeli;

    public Barang(String kodeBarang, String namaBarang, double harga, int jumlahBeli) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public double getTotalBayar() {
        return harga * jumlahBeli;
    }
}