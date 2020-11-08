 import java.util.Scanner;
/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */

 public class PBOIF10K101199915Latihan35 {
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        
        tunjangan myTunjangan = new tunjangan();
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa Gaji Pokok Anda Sebulan? : Rp. ");  
        gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum) ? : ");
        status = scanner.next();
        System.out.println("");
        
        myTunjangan.hitungTunjangan(gajiPokok, status);
        System.out.println("(Developed by : M Hongki Alfikram)");
    }
}