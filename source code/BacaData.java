import java.util.Scanner;
/*
    Nama : Nuraziza yunus
    NIM  : 13020210126
    Hari/Tanggal : Selasa, 7 Maret 2023
    Waktu Pengerjaan : 16.30

 */
/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {
    /**
     * @param args
     */
    public static void main(String[] args) {

// TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik :
masukan.nextInt();
Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}
