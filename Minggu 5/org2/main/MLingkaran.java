package main;
import BangunDatar.Lingkaran;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); /* Scanner digunakan untuk input bagi jejari */
        System.out.print("Masukkan jejari: ");
        double jejari = scan.nextDouble(); /* jejari diisi dengan nilai input yang didapatkan dari Scanner */
        Lingkaran l = new Lingkaran(jejari); /* Inisialisasi lingkaran */
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close(); /* untuk menutup Scanner */
    }
}