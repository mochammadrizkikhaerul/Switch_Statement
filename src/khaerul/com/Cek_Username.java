package khaerul.com;

import java.util.Scanner;

public class Cek_Username {

    public static void main(String[] args) {

        String Nama;

        Scanner scanner = new Scanner( System.in );

        System.out.println( "Cek Username" );
        System.out.println( "=================================================================" );
        System.out.println( "Masukan Username Anda Dengan Benar:" );
        String pilihaninput = scanner.nextLine();

        switch (pilihaninput) {
            case "Rizki":
                System.out.print("Benar! Username Yang anda Masukan benar dengan Nama lengkap\n" +
                        "Mochammad Rizki Khaerul Muhaemin");
            break;
            case "Hasan":
                System.out.print("Benar! Username Yang anda Masukan benar dengan Nama lengkap\n" +
                        "Abdullah Al Hasan Mustafa");
            break;
            case "Mursyid":
                System.out.print("Benar! Username Yang anda Masukan benar dengan Nama lengkap\n" +
                        "M. Mursyid Abdurrahman");
                break;
            case "Fauzul":
                System.out.print("Benar! Username Yang anda Masukan benar dengan Nama lengkap\n" +
                        "Muhammad Fauzul Adhim");
                break;
            case "Hanif":
                System.out.print("Benar! Username Yang anda Masukan benar dengan Nama lengkap\n" +
                        "Abdullah Hanif Fakhrudin");
                break;
            default :
                System.out.print("ERROR!!!");
        }
    }
}
