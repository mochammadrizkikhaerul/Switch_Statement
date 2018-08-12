package khaerul.com;

import java.util.Scanner;

public class Pencarian_Data_Siswa_SMK {

    public static void main(String[] args) {

        String Nama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cari Data Siswa SMK Rabbaanii dengan keyword NIS (Nomor Induk Siswa)");
        System.out.println("========================================================================");
        System.out.println("Masukkan NIS Siswa SMK [Contoh:17182340002] : ");
        String pilihinput = scanner.nextLine();

        switch (pilihinput) {
            case "18190410001":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410001 Dimiliki oleh\n" +
                        "Siswa bernama Abdullah Al Hasan Mustafa\n" +
                        "========================================================================");
                break;
            case "18190410002":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18190410002 Dimiliki oleh\n" +
                        "Siswa bernama Abdullah Hanif Fakhrudin\n" +
                        "========================================================================");
                break;
            case "18190410003":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410003 Dimiliki oleh\n" +
                        "Siswa bernama Fauzi Albir Maulana\n" +
                        "========================================================================");
                break;
            case "18190410004":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410004 Dimiliki oleh\n" +
                        "Siswa bernama Gilar Wahibul Azhar\n" +
                        "========================================================================");
                break;
            case "18190410005":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410005 Dimiliki oleh\n" +
                        "Siswa bernama M. Fauzul Adhim\n" +
                        "========================================================================");
                break;
            case "18190410006":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410006 Dimiliki oleh\n" +
                        "Siswa bernama M. Mursyid Abdurrahman\n" +
                        "========================================================================");
                break;
            case "18190410007":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410007 Dimiliki oleh\n" +
                        "Siswa bernama Mochammad Rizki Khaerul Muhaemin\n" +
                        "========================================================================");
                break;
            case "18190410008":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410008 Dimiliki oleh\n" +
                        "Siswa bernama Muhammad Hilmi\n" +
                        "========================================================================");
                break;
            case "18190410009":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 18199410009 Dimiliki oleh\n" +
                        "Siswa bernama Nafizzul Izzata Insan\n" +
                        "========================================================================");
                break;
            case "17180410001":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 17189410001 Dimiliki oleh\n" +
                        "Siswa bernama Abiyyu Daffa'Alam\n" +
                        "========================================================================");
                break;
            case "17180410002":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 17189410002 Dimiliki oleh\n" +
                        "Siswa bernama Fatchan Muhammad Hakim\n" +
                        "========================================================================");
                break;
            case "17180410003":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 17180410003 Dimiliki oleh\n" +
                        "Siswa bernama Muhammad Nur Irsaddul Ma'ruf Brk\n" +
                        "========================================================================");
                break;
            case "17180410004":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 17180410004 Dimiliki oleh\n" +
                        "Siswa bernama Muhammad Ridwan Alazzam\n" +
                        "========================================================================");
                break;
            case "17180410005":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 17180410005 Dimiliki oleh\n" +
                        "Siswa bernama Raga Murtadha Mutahari\n" +
                        "========================================================================");
                break;
            case "17180410006":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 17180410006 Dimiliki oleh\n" +
                        "Siswa bernama Ramadhani Bagus Satrio Wibowo\n" +
                        "========================================================================");
                break;
            case "17180410007":
                System.out.print( "Data Siswa ditemukan!\n" +
                        "Data Siswa yang dicari adalah dengan NIS 17189410007 Dimiliki oleh\n" +
                        "Siswa bernama Ridho Fitra Palasa\n" +
                        "========================================================================");
                break;
            default :
                System.out.print("Data Siswa Tidak ditemukan...\n" +
                        "========================================================================");
        }
    }
}
