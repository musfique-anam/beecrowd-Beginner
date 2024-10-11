import java.io.IOException;
import java.util.Scanner;
public class problem1006 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        double A,B,C,M;
        A=scan.nextDouble();
        B=scan.nextDouble();
        C=scan.nextDouble();
        M=((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f",M);
        System.out.println();  
    }    
}
