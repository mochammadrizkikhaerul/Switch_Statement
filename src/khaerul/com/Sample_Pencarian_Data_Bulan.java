package khaerul.com;

import java.util.Scanner;

public class Sample_Pencarian_Data_Bulan {

    public static void main(String[] args) {

        String Nama;

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Urutan Nama Bulan Masehi" );
        System.out.println( "==================================" );
        System.out.println( "Masukan Nomor Urutan Bulan [1-12]: " );
        String pilihinput = scanner.nextLine();

        switch (pilihinput) {
            case "1":
                System.out.print("Urutan Bulan Pertama Masehi Adalah Januari");
                break;
            case "2":
                System.out.print("Urutan Bulan Kedua Masehi Adalah Februari" );
                break;
            case "3":
                System.out.print("Urutan Bulan Ketiga Masehi Adalah Maret");
                break;
            case "4":
                System.out.print("Urutan Bulan Keempat Masehi Adalah April");
                break;
            case "5":
                System.out.print("Urutan Bulan Kelima Masehi Adalah Mei");
                break;
            case "6":
                System.out.print("Urutan Bulan Keenam Masehi Adalah Juni");
                break;
            case "7":
                System.out.print("Urutan Bulan Ketujuh Masehi Adalah Juli");
                break;
            case "8":
                System.out.print("Urutan Bulan Kedelapan Masehi Adalah Agustus");
                break;
            case "9":
                System.out.print("Urutan Bulan Kesembilan Masehi Adalah September");
                break;
            case "10":
                System.out.print("Urutan Bulan Kesepuluh Masehi Adalah Oktober");
                break;
            case "11":
                System.out.print("Urutan Bulan Kesebelas Masehi Adalah November");
                break;
            case "12":
                System.out.print("Urutan Bulan Keduabelas Masehi Adalah Desember");
                break;
            default :
                System.out.print("Bulan tidak ditemukan\n" +
                        "Urutan bulan hanya 1-12");
        }
    }
}
