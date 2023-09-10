import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class tokenizeWithPackage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> tokens = new ArrayList<>();

        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        System.out.println(tokens.size());
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}