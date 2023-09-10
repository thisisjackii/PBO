import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan plat nomor 4 mobil (pakai spasi): ");
            String input = scanner.nextLine();

            String[] platNomorMobil = input.split(" ");

            boolean bolehJalan = true;
            for (String platNomor : platNomorMobil) {
                int gabunganAngka = Integer.parseInt(platNomor);
                if ((gabunganAngka - 999999) % 5 != 0) {
                    bolehJalan = false;
                    break; // jika satu mobil diberhentikan, maka semua diberhentikan
                }
            }

            String hasil = bolehJalan ? "Jalan" : "Berhenti";
            System.out.println(hasil);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
