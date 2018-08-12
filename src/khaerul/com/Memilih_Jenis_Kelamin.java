package khaerul.com;

import java.util.Scanner;

public class Memilih_Jenis_Kelamin {

    public static void main(String[] args) {

        String Nama;

        Scanner scanner = new Scanner( System.in );

        System.out.println("Masukan Jenis Kelamin!");
        System.out.println("=================================================");
        System.out.println("Masukan Jenis Kelamin Anda L/P: ");
        String pilihinput = scanner.nextLine();

        switch (pilihinput) {
            case "L":
                System.out.println("Jenis Kelamin Anda Adalah Laki-Laki");
                System.out.print("=================================================");
                break;
            case "P":
                System.out.println("Jenis Kelamin Anda Adalah Perempuan");
                System.out.print("=================================================");
                break;
            default :
                System.out.println("Jenis Kelami Tidak Ditemukan!!!");
                System.out.print("=================================================");
        }
    }
}
