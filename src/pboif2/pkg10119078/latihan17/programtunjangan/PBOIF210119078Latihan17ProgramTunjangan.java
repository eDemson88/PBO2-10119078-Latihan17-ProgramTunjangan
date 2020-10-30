/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk menampilkan variabel
 *
 */
package pboif2.pkg10119078.latihan17.programtunjangan;


import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gaji;
        double tambahTunjangan; 
        String status;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("========Program Tunjangan========");
        System.out.printf("Berapa gaji pokok anda perbulan?: Rp. ");
        gaji = scanner.nextInt();
        System.out.printf("Status anda?: (Menikah/Belum): ");
        status = scanner.next();
        
        if (status.equals("menikah")||(status.equals("Menikah"))){
            tambahTunjangan = (0.35 * gaji);
    }     else {
            tambahTunjangan = (0 * gaji);
        }
        
        
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji anda adalah : " + gaji);
        System.out.println("Tunjangan : " + tambahTunjangan);
        System.out.println("Total Gaji : " + (gaji + tambahTunjangan));
    }
    
}
