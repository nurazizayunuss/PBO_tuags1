/*
    Nama : Nuraziza yunus
    NIM  : 13020210126
    Hari/Tanggal : Selasa, 7 Maret 2023
    Waktu Pengerjaan : 16.30

 */
/* Operator terner */
public class Oper4 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        /* KAMUS */
        int i = 0; /* perhatikan int i,j=0 bukan seperti ini */
        int j = 0;
        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);
        /* ALGORITMA */
        System.out.print ("Nilai e = "+ e);
        System.out.print ("\nNilai k = "+ k);
        i = 2;
        j = 3;
        k = ((i++>j++) ? i: j) ;
        System.out.print ("\nNilai k = "+ k);
    }
}
