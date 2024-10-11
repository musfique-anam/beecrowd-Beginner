import java.io.IOException;
import java.util.Scanner;
public class problem1002 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            double R=scan.nextDouble();
            double A=(3.14159*R*R);
            System.out.format("A=%.4f\n",A);
        }
    }
}