package qoqon;

import java.util.Scanner;

public class krs implements proses{

    private int jumsks;
    private int tothargasks,hargasks = 200000;
    private int semester;
    private String nama,nim,no,asal;

    @Override
    public void daftar() {
        int sks = 21;
        int smt = 1 ;
        int totharga;
        totharga = hargasks*sks;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("____________________________________________________");
        System.out.println("                DATA PENDAFTAR                      ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NAMA MAHASISWA      = ");
        nama = scan1.nextLine();
        System.out.println();
        System.out.printf("MASUKAN NIM MAHASISWA       = ");
        nim = scan1.nextLine();
        System.out.printf("MASUKAN NO TELP MAHASISWA  = ");
        no = scan1.nextLine();
        System.out.printf("ASAL PROVINSI              = ");
        asal = scan1.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                DATA TERDAFTAR                      ");
        System.out.println("____________________________________________________");
        System.out.println("NAMA            = "+nama);
        System.out.println("NIM             = "+nim);
        System.out.println("NO TELP         = "+no);
        System.out.println("ASAL KOTA/PROV  = "+asal);
        System.out.println("SEMESTER        = "+smt);
        System.out.println("SKS             = "+sks);
        System.out.println("TOTAL PEMBAYARAN= "+totharga);
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void bayar() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                DATA MAHASISWA                      ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NAMA MAHASISWA      = ");
        nama = scan2.nextLine();
        System.out.println();
        System.out.printf("MASUKAN NIM MAHASISWA       = ");
        nim = scan2.nextLine();
        System.out.println();
        System.out.printf("MASUKAN SEMESTER            = ");
        semester = scan2.nextInt();
        System.out.printf("JUMLAH SKS                  = ");
        jumsks = scan2.nextInt();
        tothargasks = jumsks*hargasks;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                         DATA PEMBAYARAN SKS                         ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("NAMA            = "+nama);
        System.out.println("NIM             = "+nim);
        System.out.println("SEMESTER        = "+semester);
        System.out.println("SKS             = "+jumsks);
        System.out.println("TOTAL PEMBAYARAN= "+tothargasks);
    }
}
