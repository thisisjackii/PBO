import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dua string
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // Menjumlahkan panjang kedua string
        int lengthSum = A.length() + B.length();

        // Pengecekan apakah B lebih dulu muncul dalam kamus dibandingkan A
        boolean lexicographChecker = A.compareTo(B) > 0;

        // Buat huruf pertama kedua string menjadi besar
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Tampilkan output
        System.out.println(lengthSum);
        System.out.println(lexicographChecker?"Yes":"No");
        System.out.println(A + " " + B);

        // Tutup scanner untuk membebaskan memori
        scanner.close();
    }
}