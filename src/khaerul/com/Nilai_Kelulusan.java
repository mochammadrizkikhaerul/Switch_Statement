package khaerul.com;

import java.util.Scanner;

public class Nilai_Kelulusan {
    public static void main(String[] args) {

        int Nilai;

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Nilai Kelulusan\n" +
                "==================================\n" +
                "Masukan Nilai Kelulusan [0-100]: " );
        Nilai = scanner.nextInt();

        if (Nilai <= 65) {
            System.out.println("Nilai 0 - 65 | D Remedial");
        } else if (Nilai <= 75) {
            System.out.println("Nilai 66 - 75 | C Cukup");
        } else if (Nilai <= 85) {
            System.out.println("Nilai 76 - 85 | B Baik");
        } else if (Nilai <= 95) {
            System.out.println("Nilai 86 - 95 | A Sangat Baik");
        } else if (Nilai <= 100) {
            System.out.println("Nilai 96 - 100 | A+ Sangat-sangat Baik");
        } else {
            System.out.print("Tidak ada kategori nilai");
        }
    }
}