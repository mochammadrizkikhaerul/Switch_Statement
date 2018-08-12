package khaerul.com;

import java.util.Scanner;

public class Sample_Convert_Switch_to_If {

    public static void main(String[] args) {

        int Urutan;

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Urutan Nama Bulan Masehi\n" +
                "==================================\n" +
                "Masukan Nomor Urutan Bulan [1-12]: " );
        Urutan = scanner.nextInt();

        if (Urutan == 1) {
            System.out.println( "\nJanuari" );
        } else if (Urutan == 2) {
            System.out.println( "\nFebruari" );
        } else if (Urutan == 3) {
            System.out.println( "\nMaret" );
        } else if (Urutan == 4) {
            System.out.println("\nApril");
        } else if (Urutan == 5) {
            System.out.println( "\nMei" );
        } else if (Urutan == 6) {
            System.out.println( "\nJuni" );
        } else if (Urutan == 7) {
            System.out.println( "\nJuli" );
        } else if (Urutan == 8) {
            System.out.println( "\nAgustus" );
        } else if (Urutan == 9) {
            System.out.println( "\nSeptember" );
        } else if (Urutan == 10) {
            System.out.println( "\nOktober" );
        } else if (Urutan == 11) {
            System.out.println( "\nNovember" );
        } else if (Urutan == 12) {
            System.out.println( "\nDesember" );
        } else {
            System.out.println( "\nTidak Tersedia!!" );
        }
    }
}
