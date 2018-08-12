package khaerul.com;

import java.util.Scanner;

public class Battery {

    public static void main(String[] args) {

        int Nilai;

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Daya Baterai\n" +
                "==============================================\n" +
                "Masukan Persentase Daya Baterai [0-100]: " );
        Nilai = scanner.nextInt();

        if (Nilai <= 20) {
            System.out.println("Low Battery\n" +
                    "==============================================");
        } else if (Nilai <= 40) {
            System.out.println("Proses 1\n" +
                    "==============================================");
        } else if (Nilai <= 60) {
            System.out.println("Proses 2\n" +
                    "==============================================");
        } else if (Nilai <= 80) {
            System.out.println("Good\n" +
                    "==============================================");
        } else if (Nilai <= 100) {
            System.out.println("Full Charge Battery\n" +
                    "==============================================");
        } else {
            System.out.print( "Tidak ada Kategori Daya\n" +
                    "==============================================" );

        }
    }
}