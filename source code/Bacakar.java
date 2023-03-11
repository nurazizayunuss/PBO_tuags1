/*
    Nama : Nuraziza yunus
    NIM  : 13020210126
    Hari/Tanggal : Selasa, 7 Maret 2023
    Waktu Pengerjaan : 16.30

 */
import java.util.Scanner;
import java.io.Console;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import javax.swing.*; 
public class Bacakar {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
        /* Kamus */
        char cc; int bil;
        InputStreamReader isr = new
                InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
// atau
        BufferedReader datAIn = new BufferedReader(new
                InputStreamReader(System.in));
        /* Algoritma */
        System.out.print ("hello\n");
        System.out.print("baca 1 karakter : ");
//perintah baca karakter cc
        cc =dataIn.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");
//perintah baca bil
        bil =Integer.parseInt(datAIn.readLine());
/*String kar = JOptionPane.showInputDialog("Karakter 1 
: "); System.out.println(kar);*/
//JOptionPane.showMessageDialog(null,"hello"); 
        System.out.print (cc +"\n" +bil+"\n");
        System.out.print ("bye \n");

        /* Tambahkan program membaca/input data
        menggunakan Class Scanner, Class Console dan Class
        JOptionPane */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Teks : ");
        String teks = "";
        teks = scan.next();

        Console console = System.console();
        if (console == null) {
            System.out.println("Program ini harus dijalankan dalam konsol (cmd contohnya).");
            System.exit(1);
        }
        System.out.print("Input Teks Lagi : ");
        String teks2 = "";
        teks2 = console.readLine();

        String teks3;
        teks3 = JOptionPane.showInputDialog(null, "Input Teks Terakhir :");
    }
}