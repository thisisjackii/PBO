import java.util.Scanner;

public class DataTypeFitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = 0;
        try {
            System.out.print("How many test cases do you want? ");
            t = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please input a number.");
        }
        
        for (int i = 0; i < t; i++) {
            try {
                System.out.print("Enter "+(i+1)+ordinalityChecker(i+1)+" number: ");
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");
                
                if (fitsInDataType(n, Byte.class)) {
                    System.out.println("* byte");
                } if (fitsInDataType(n, Short.class)) {
                    System.out.println("* short");
                } if (fitsInDataType(n, Integer.class)) {
                    System.out.println("* int");
                } if (fitsInDataType(n, Long.class)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere");
            }
        }
        scanner.close();
    }
    
    private static boolean fitsInDataType(long n, Class<?> dataType) {
        if (dataType == Byte.class) {
            return n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE;
        } else if (dataType == Short.class) {
            return n >= Short.MIN_VALUE && n <= Short.MAX_VALUE;
        } else if (dataType == Integer.class) {
            return n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE;
        } else if (dataType == Long.class) {
            return true; // All long values are within range
        }
        return false;
    }
    
    private static String ordinalityChecker(int num) {
        if (num % 100 >= 11 && num % 100 <= 13) {
            return "th";
        }
        switch (num % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}