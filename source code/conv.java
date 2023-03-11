import java.util.Scanner;

public class conv {
    public static int detik_sekarang(int detik){
        return detik % 60;
    }
    public static int total_menit(int detik){
        return detik / 60;
    }
    public static int menit_sekarang(int menit){
        return menit % 60;
    }
    public static int total_jam(int menit){
        return menit / 60;
    }
    public static int jam_sekarang(int jam){
        return jam % 24;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int total_detik = scan.nextInt();
        int res_detik_sekarang = detik_sekarang(total_detik);
        int res_total_menit = total_menit(total_detik);
        int res_menit_sekarang = menit_sekarang(res_total_menit);
        int res_total_jam = total_jam(res_total_menit);
        int res_jam_sekarang = jam_sekarang(res_total_jam);

        System.out.printf("Waktu sekarang: %02d:%02d:%02d", res_jam_sekarang, res_menit_sekarang, res_detik_sekarang);
    }
}
