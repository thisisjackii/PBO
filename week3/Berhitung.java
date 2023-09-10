import java.util.*; // untuk scanner dan exception
}
public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.nextLine(); // satu kali input alih-alih pakai 3 scanner, bagus untuk efisiensi sekaligus mempermudah exception handling
            String[] parts = input.split(" "); // pisah input berdasarkan letak spasi

            if (parts.length != 3) { // jika tidak terdapat 3 karakter non-spasi
                throw new InputMismatchException("Invalid input format. You need to enter firstnumber<space>operator<space>secondmumber.");
            }

            int A = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int B = Integer.parseInt(parts[2]);

            if (withinRangeLimit(A, B, 1, 1000)) {
                throw new InputMismatchException("A and B must be between 1 and 1000. No more, no less.");
            }

            int res = 0;

            if (operator.equals("+")) { // pakai .equals() untuk komparasi yang lebih baik
                res = A + B;
            } else if (operator.equals("-")) {
                res = A - B;
            } else if (operator.equals("*")) {
                res = A * B;
            } else if (operator.equals("/")) { // sudsh tidak perlu lagi exception pembagian 0 karena sudah di-handle
                res = A / B;
            } else if (operator.equals("%")) {
                res = A % B;
            } else {
                System.out.println("Error: Invalid operator."); // salah operator
                return; 
            }

            System.out.println(res);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input. Please enter valid integers."); // jika bukan integer input
        } catch (NoSuchElementException e) {
            System.out.println("Error: Insufficient input provided.");
        }
    }
    
    private static boolean withinRangeLimit(int Operand1, int Operand2, int minLimiit, int maxLimit) {
        return (Operand1 < 1 || Operand2 < 1 || Operand1 > 1000 || Operand2 > 1000);
    }
}