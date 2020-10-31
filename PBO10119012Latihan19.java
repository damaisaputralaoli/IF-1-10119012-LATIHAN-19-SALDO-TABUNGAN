package  pbo10119012latihan19;

/**
 *
 * @author damai
 * NAMA     : Damai Saputra Laoli
 * KELAS    : IF 1
 * NIM      : 10119012
 */
public class PBO10119012Latihan19 {

    
    public static void main(String[] args) {
        double saldo_awal = 2500000;
        for (double i = 1; i <= 6; i++) {
            saldo_awal += Math.floor(saldo_awal * 0.15);
            System.out.printf("Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n",i,saldo_awal);
        }
    }
}