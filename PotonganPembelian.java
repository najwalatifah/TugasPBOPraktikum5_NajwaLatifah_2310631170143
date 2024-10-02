package potonganpembelian;
import java.util.Scanner;
public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
    
        // Input total pembelian
        System.out.println("Total pemebelian Rp. = ");
        double TotalPembelian = masukan.nextDouble();
        
        //Menentukan potongan
        double potongan;
        if (TotalPembelian < 50000) {
            potongan = 0.05 * TotalPembelian;
        } else {
            potongan = 0.2 * TotalPembelian;
        }
        
        // Menghitung jumlah yang harus dibayar
        double JumlahBayar = TotalPembelian - potongan;
        
        // output
        System.out.println("Besaranpotongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayr Rp. " + JumlahBayar);
    }
    
}
