//Beginner Problem 1007 : Difference !
import java.io.IOException;
import java.util.Scanner;
public class problem1007 {
 
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        int D=scan.nextInt();
        
        int P=(A*B-C*D);
        
        System.out.println("DIFERENCA = "+P);
 
    }
 
}