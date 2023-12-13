import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final String USERNAME = "Silverwolf";
    private static final String PASSWORD = "Kafka123";
    private static final String CAPTCHA = "MitSuki";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Login
            System.out.print("Masukkan username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String enteredPassword = scanner.nextLine();

            System.out.println("Kode Captcha : MitSuki");
            System.out.print("Masukkan Captcha: ");
            String enteredCaptcha = scanner.nextLine();

            if (!checkLogin(enteredUsername, enteredPassword, enteredCaptcha)) {
                System.out.println("Login gagal. Aplikasi akan keluar.");
                return;
            }

            System.out.println("");
            // Menerima input data pelanggan
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Masukkan nomor HP pelanggan: ");
            String nomorHP = scanner.nextLine();
            // Validasi nomor HP hanya berisi angka
            if (!nomorHP.matches("\\d+")) {
                throw new InputMismatchException("Nomor HP harus berisi angka.");
            }

            System.out.print("Masukkan alamat pelanggan: ");
            String alamat = scanner.nextLine();

            Pelanggan pelanggan = new Pelanggan(namaPelanggan, nomorHP, alamat);

            // Menerima input data pembelian
            System.out.print("Masukkan kode barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan nama barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan harga barang: ");
            double harga = scanner.nextDouble();

            System.out.print("Masukkan jumlah beli: ");
            int jumlahBeli = scanner.nextInt();

            // Mengonsumsi newline character setelah nextInt()
            scanner.nextLine();

            Barang barang = new Barang(kodeBarang, namaBarang, harga, jumlahBeli);

            StrukPembelian strukPembelian = new StrukPembelian(pelanggan, barang, namaBarang);

            // Menampilkan struk pembelian
            strukPembelian.tampilkanStruk();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Tutup scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static boolean checkLogin(String enteredUsername, String enteredPassword, String enteredCaptcha) {
        // Menggunakan equalsIgnoreCase untuk membandingkan captcha tanpa memperhatikan case
        return USERNAME.equals(enteredUsername) && PASSWORD.equals(enteredPassword) && CAPTCHA.equalsIgnoreCase(enteredCaptcha);
    }
}