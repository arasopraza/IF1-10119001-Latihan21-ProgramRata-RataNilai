import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini mencari nilai
 * rata-rata yg diinput user
 */

public class ProgramRataRataNilai {
    public static void main(String[] args) {
        int i, jumlahMahasiswa;
        double[] nilaiMahasiswa;
        double totalNilai, nilaiRataRata;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();

        totalNilai = 0;
        nilaiMahasiswa = new double[jumlahMahasiswa];

        for (i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMahasiswa[i] = scanner.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }

        nilaiRataRata = totalNilai/jumlahMahasiswa;
        System.out.println("\n");
        System.out.println("Maka, Rata-rata Nilainya adalah "+ nilaiRataRata);
        System.out.println("Developed by: Arsy Opraza Akma");
    }
}
