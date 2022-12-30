package qoqon;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        krs t1 = new krs();
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("____________________________________________________");
        System.out.println("|                                                  |");
        System.out.println("|                                                  |");
        System.out.println("|    PROGRAM PEMBAYARAN DAN PENDAFTARAN KRS        |");
        System.out.println("|           UNIVERSITAS AHMAD DAHLAN               |");
        System.out.println("|                                                  |");
        System.out.println("|                                                  |");
        System.out.println("____________________________________________________");
        do {
            System.out.println("1. PENDAFTARAN KRS UNTUK MAHASISWA BARU ");
            System.out.println("2. PEMBAYARAN KRS UNTUK MAHASISWA UAD   ");
            System.out.println("3. KELUAR ");
            System.out.printf("   MASUKAN PILIHAN ANDA         = ");
            menu = input.nextInt();
            if (menu==1){
                t1.daftar();
            } else if (menu==2) {
                t1.bayar();
            }else if (menu==3){
                System.out.println("TERIMAKASIH !!!!");
            }else {
                System.out.println("DATA YANG ANDA MASUKAN TIDAK VALID !!!");
            }
        }while (menu!=3);
    }
}
