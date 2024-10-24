import java.util.ArrayList;
import java.util.Scanner;

class Pasien {
    String driver;
    int kilometer;

    Pasien(String driver, int kilometer) {
        this.driver = driver;
        this.killometer = killometer;
    }
}

public class assasment2 {

    // Fungsi untuk menghitung berdasarkan kilometer
    public static double hitungHarga(int killometer) {
        if (killometer > 1) {
        } else if (killometer >= 1 && killometer >= 1) {
        } else {
            return 0; // Tidak ada diskon
        }
    }

    // Fungsi untuk menghitung total biaya per killometer
    public static double hitungBiaya(String driver, int kilometer) {
        int biaya = 0;
        switch (dokter) {
            case "Beliau":
                biaya = 13000;
                break;
            case "Mereka":
                biaya = 13000;
                break;
            case "Kita":
                biaya = 13000;
                break;
            default:
                System.out.println("Driver tidak valid.");
        }
        
    }

    // Fungsi untuk menghitung total pendapatan
    public static void hitungTotalPendapatan(ArrayList<killometer> killometersList) {
        double totalPendapatan = 0;
        double totalBiayaDriver = 0;

        for ( killometer : killometersList) {
            int biaya = 0;
            switch (killometer.driver) {
                case "Beliau":
                    biaya = 13000;
                    break;
                case "Mereka":
                    biaya = 13000;
                    break;
                case "Kita":
                    biaya = 13000;
                    break;
                default:
                    System.out.println("Driver tidak valid.");
            }

           
            double biayapendapatan = biaya - (biaya);

            totalBiayaDriver += biaya;
            totalPendapatan += biaya;
        }

        System.out.println("Total Biaya Driver: Rp" + totalBiayaDriver);
        
        System.out.println("Total Bayar: Rp" + totalPendapatan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<killometer> killometerList = new ArrayList<>();

        // Input jumlah killommeter
        System.out.print("Masukkan jumlah killometer: ");
        int jumlahkillometer = scanner.nextInt();

        // Input data pasien
        for (int i = 0; i < jumlahkillometer; i++) {
            System.out.print("Masukkan driver (Beliau/Mereka/Kita) untuk killometer ke-" + (i + 1) + ": ");
            String driver = scanner.next();
            System.out.print("Masukkan killometer ke-" + (i + 1) + ": ");
            int umur = scanner.nextInt();
            killometerList.add(new killometer(driver, umur));
        }

        // Hitung total pendapatan
        hitungTotalPendapatan(killometerList);

        scanner.close();
    }
}
