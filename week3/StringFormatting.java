import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Format: String Integer");
        System.out.println("Enter input (Ctrl+D or Ctrl+Z to end input):");
        // tidak semua compiler bisa pakai ini untuk interupsi input

        List<String> inputStrings = new ArrayList<>();
        List<Integer> inputIntegers = new ArrayList<>();

        while (scanner.hasNext()) { // loop berlangsung selama ada input
            inputStrings.add(scanner.next()); // string
            inputIntegers.add(scanner.nextInt());
            // bilangan (otomatis terpisah dari input string setelah spasi)
        }

        System.out.println("================================")
        formatAndPrintInput(inputStrings, inputIntegers);
        System.out.println("================================");
    }

    public static void formatAndPrintInput(List<String> inputStrings, List<Integer> inputIntegers) {
        for (int i = 0; i < inputStrings.size(); i++) {
            String inputString = inputStrings.get(i);
            int inputInteger = inputIntegers.get(i);
            System.out.printf("%-15s%03d%n", inputString, inputInteger);
            // format specifier dan padding output
        }
    }
}
