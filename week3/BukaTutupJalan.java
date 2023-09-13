import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] platNumbers = scanner.nextLine().split(" ");

        int total = 0;
        for (String plat : platNumbers) {
            total += Integer.parseInt(plat);
        }

        if ((total - 999999) % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}
