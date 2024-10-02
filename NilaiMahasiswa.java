package nilaimahasiswa;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        
        //Input data mahasiswa
        System.out.println("NPM: ");
        String NPM = masukan.nextLine();
        System.out.println("Nama Mahasiswa: ");
        String Nama = masukan.nextLine();
        System.out.println("Nilai Kehadiran: ");
        double NilaiKehadiran = masukan.nextDouble();
        System.out.println("Nilai Tugas: ");
        double NilaiTugas = masukan.nextDouble();
        System.out.println("UTS: ");
        double NilaiUTS = masukan.nextDouble();
        System.out.println("UAS: ");
        double NilaiUAS = masukan.nextDouble();
        
        // Menghitung nilai akhir
        double NilaiAkhir = (0.1 * NilaiKehadiran) + (0.2 * NilaiTugas) + (0.3 * NilaiUTS) + (0.4 * NilaiUAS);
        // Menentukan grade dan keterangan
        String grade;
        String keterangan;
        
        if (NilaiAkhir >= 76 && NilaiAkhir <= 100) {
            grade = "A";
            keterangan = "Istemewa"; 
        } else if (NilaiAkhir >= 66 && NilaiAkhir < 76) {
            grade = "B";
            keterangan = "Baik";
        } else if (NilaiAkhir >= 66 && NilaiAkhir < 76) {
            grade = "C";
            keterangan = "Cukup";
        } else if (NilaiAkhir >= 56 && NilaiAkhir < 66) {
            grade = "D";
            keterangan = "Kurang";
        } else {
            grade = "E";
            keterangan = "Kurang Sekali";
        }
        
        // Output
        System.out.println("NPM Mahasiswa: " + NPM);
        System.out.println("Nama Mahasiswa: " + Nama);
        System.out.println("Nilai Rata-rata: " + NilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
    
}