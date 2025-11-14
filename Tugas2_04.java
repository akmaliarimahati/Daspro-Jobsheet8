import java.util.Scanner;

public class Tugas2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;

        while (true) {
            System.out.print("Masukkan Angka (minimal 3, 0 untuk keluar): ");
            angka = sc.nextInt();

            if (angka == 0) {
                System.out.println("Program Berhenti.");
                break;
            }

            if (angka < 3) {
                System.out.println("Angka kurang dari 3. Coba Lagi!\n");
                continue;
            }

            for (int i = 1; i <= angka; i++) {
                for (int j = 1; j <= angka; j++) {
                    if (i == 1 || i == angka || j == 1 || j == angka) {
                        System.out.print(angka + " ");
                    } else if (angka >= 10) {
                        System.out.print("   ");
                    }else {
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
