import java.util.Scanner;

public class assasment {
    public static void main(String[] args) {
        // Daftar jam lembur dan gaji
        String[] jam = {"16","12","20"};
        int[] gaji = {10000, 15000};
        
        //Scanner untuk input dari 
        Scanner scanner = new Scanner(System.in)
        System.out.println("Pilih total gaji dalam per jam(masukan angka i>16 dan i<16):");
        System.out.println("1. i>16jam(Rp 15.000)");
        System.out.println("2. i<16jam(Rp 10.000)");
        
        // Meminta input pilihan gaji untuk setiap jam
        int[] pilihan = new int[16];
    for (int i = 0; i < 16; i++) {
        System.out.print("Gaji jam ke-" + (i + 16) + ": ");
        pilihan[i] = scanner.nextInt() - 1; // -1 karena index array mulai dari 0
    }
    // Menghitung total gaji selama perjam
    int totalGaji = 0;
    for (int i = 0; i < 16; i++) {
        int jam kerja = gaji[pilihan[i]];
        // Cek apakah gaji kerja perjam
        if (i >= 16) { // i = > 16 , i = 1 (Jam)
            if (gaji > 10000) {
                gaji *= 10000; // Bonus 10000 untuk jam di bawah 16 jam
            } else if (gaji > 15000) {
                gaji *= 15000; // Bonus 15000 untuk jam di atas 16 jam
            }
        }
        totalJam += Gaji;
    }
     // Menampilkan total gaji
     System.out.println("Total gaji dalam waktu perjam: Rp " + totalJam);
     scanner.close();

}
    
