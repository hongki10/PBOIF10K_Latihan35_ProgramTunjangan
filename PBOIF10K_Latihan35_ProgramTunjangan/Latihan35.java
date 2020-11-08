/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */
 
 class tunjangan {
    double tunjangan;
    double total;

     public void hitungTunjangan(double gajiPokok, String status){
         System.out.println("========Hasil Perhitungan Gaji========");
         System.out.println("Berapa Gaji Pokok anda perbulan : " + gajiPokok);
         
         //Tunjangan
         tunjangan = (status.equalsIgnoreCase("Menikah")) ? gajiPokok * 0.35 : 0;
        
         System.out.println("Tunjangan : Rp. " + tunjangan);
         
        //Total Gaji
         total = tunjangan + gajiPokok;
         System.out.println("Total Gaji : Rp. " + total);
     }
}