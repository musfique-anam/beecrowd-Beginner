import java.io.IOException;
import java.util.Scanner;
public class problem1004 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int A=scan.nextInt();
            int B=scan.nextInt();
            int PROD=A*B;
            System.out.println("PROD = "+PROD);
        }  
    }
}