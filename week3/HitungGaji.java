import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int gajiPokok = 500000;
            int hargaItem = 50000;
            int jumlahPenjualan = scanner.nextInt();
            double bonus = (jumlahPenjualan > 80) ? 0.35 * jumlahPenjualan * hargaItem
                    : (jumlahPenjualan >= 40) ? 0.25 * jumlahPenjualan * hargaItem : 0;

            if (jumlahPenjualan < 15) {
                double denda = 0.15 * (15 - jumlahPenjualan) * hargaItem;
                gajiPokok -= denda;
            }
            
            double totalGaji = gajiPokok + bonus;

            System.out.println((int)totalGaji);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
