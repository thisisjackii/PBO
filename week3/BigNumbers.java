import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String num1 = scanner.nextLine();
            String num2 = scanner.nextLine();

            BigInteger a = new BigInteger(num1);
            BigInteger b = new BigInteger(num2);

            BigInteger sum = a.add(b);
            BigInteger product = a.multiply(b);

            System.out.println(sum);
            System.out.println(product);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}