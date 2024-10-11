import java.io.IOException;
import java.util.Scanner;

public class problem1038 {

    public static void main(String[] args) throws IOException {
        try(Scanner scan = new Scanner(System.in)){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            double a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, p1, p2, p3, p4, p5;
            while (X == a1) {
                p1 = 4.00 * Y;
                System.out.printf("Total: R$ %.2f\n", p1);
                break;
            }
            while (X == a2) {
                p2 = 4.50 * Y;
                System.out.printf("Total: R$ %.2f\n", p2);
                break;
            }
            while (X == a3) {
                p3 = 5.00 * Y;
                System.out.printf("Total: R$ %.2f\n", p3);
                break;
            }
            while (X == a4) {
                p4 = 2.00 * Y;
                System.out.printf("Total: R$ %.2f\n", p4);
                break;
            }
            while (X == a5) {
                p5 = 1.50 * Y;
                System.out.printf("Total: R$ %.2f\n", p5);
                break;
            }
        }  
    }
}
