package indeksmassatubuh;
import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat badan dan tinggi badan
        System.out.println("Berat Badan (kg): ");
        double BeratBadan = scanner.nextDouble();
        System.out.print("Tinggi Badan (m): ");
        double TinggiBadan = scanner.nextDouble();

        // Menghitung IMT
        double IMT = BeratBadan / (TinggiBadan * TinggiBadan);

        // Menentukan kategori berdasarkan IMT
        String kategori;
        if (IMT <= 18.4) {
            kategori = "Berat Badan Kurang";
        } else if (IMT >= 18.5 && IMT <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (IMT >= 25 && IMT <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (IMT >= 30 && IMT <= 39.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }

        // Output hasil IMT dan kategori
        System.out.println("IMT: " + IMT);
        System.out.println("Kategori: " + kategori);
    }
}

