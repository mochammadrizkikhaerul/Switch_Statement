package khaerul.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputan = new Scanner( System.in );

        System.out.println( "Mesin Coffee" );
        System.out.println( "=========================" );
        System.out.println( "[555] Espresso" );
        System.out.println( "[312] Coffelate" );
        System.out.println( "[214] Cappucino" );
        System.out.println( "=========================" );
        System.out.print( "Masukkan Kode untuk Memilih: " );
        int pilih_input = inputan.nextInt();

        //TODO 1: Membuat Switch & Case untuk Action
        switch (pilih_input) {
            case 555:
                System.out.print( "Pilihan anda Espresso: Silahkan Dinikmati...." );
                break;
            case 312:
                System.out.print( "Pilihan anda Coffelate: Silahkan Dinikmati...." );
                break;
            case 214:
                System.out.print( "Pilihan anda Cappucino: Silahkan Dinikmati...." );
                break;
        }
    }
}
