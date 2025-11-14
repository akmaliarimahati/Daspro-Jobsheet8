import java.util.Scanner;

public class Tugas1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka, jumlah; 

        System.out.print("Masukkan Angka: ");
        angka = sc.nextInt();

        for (int i = 1; i <= angka; i++) {
            jumlah = 0;
            System.out.print("Angka = " + i + " -> Jumlah Kuadrat = " );
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j * j);

                if (j < i) {
                    System.out.print(" + ");
                }

            }
            
            System.out.println(" = " + jumlah);
        }
        sc.close();
    }
}