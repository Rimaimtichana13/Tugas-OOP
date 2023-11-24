import java.util.Scanner;

public class HitungNilaiPBO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Nilai Tubes: ");
        double nilai_Tubes = input.nextDouble();
        System.out.print("Nilai Quiz: ");
        double nilai_Quiz = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilai_Tugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilai_UTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilai_UAS = input.nextDouble();

        // Menghitung nilai akhir
        double totalNilai = hitungNilaiAkhir(nilai_Tubes, nilai_Quiz, nilai_Tugas, nilai_UTS, nilai_UAS);

        // Menampilkan hasil
        tampilkanHasil(nama, nim, totalNilai);

        input.close();
    }

    public static double hitungNilaiAkhir(double tubes, double quiz, double tugas, double uts, double uas) {
        // Menghitung nilai akhir
        return (0.30 * tubes) + (0.10 * quiz) + (0.10 * tugas) + (0.25 * uts) + (0.25 * uas);
    }

    public static void tampilkanHasil(String nama, String nim, double totalNilai) {
        System.out.println("\nNama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Mata Kuliah Pemrograman Berorientasi Objek: " + totalNilai);
    }

}