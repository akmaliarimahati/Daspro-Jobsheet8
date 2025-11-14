import java.util.Scanner;

public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai, kelompokTertinggi = 0;
        float totalNilai, rataRataNilai, rataRataTertinggi = 0;

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {

                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;

            }

            rataRataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": Nilai Rata - Rata = " + rataRataNilai);
            // System.out.println("Rata-rata nilai untuk Kelompok " + i + " adalah: " + rataRataNilai);
            System.out.println();

            if (rataRataNilai > rataRataTertinggi) {
                rataRataTertinggi = rataRataNilai;
                kelompokTertinggi = i;
            }

            i++;
        
        }
        
        System.out.println("kelompok dengan Rata - Rata Tertinggi Adalah Kelompok " + kelompokTertinggi + " Dengan Nilai Rata - Rata Sebesar "
        + rataRataTertinggi);

        sc.close();
    }
}
