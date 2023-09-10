import java.util.Scanner;

public class tokenizeNoPackage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int tokenCount = 0;
        StringBuilder currentToken = new StringBuilder();
        boolean insideToken = false;

        System.out.println("Tokens:");

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                currentToken.append(c);
                insideToken = true;
            } else if (insideToken) {
                System.out.println(currentToken.toString());
                tokenCount++;
                currentToken.setLength(0); 
                insideToken = false;
            }
        }

        if (insideToken) {
            System.out.println(currentToken.toString());
            tokenCount++;
        }

        System.out.println("\nToken Count: " + tokenCount);
    }
}
