// Problem - 1043 : Triangle
import java.io.IOException;
import java.util.Scanner;
public class problem1043 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan =new Scanner(System.in)){
            double A,B,C;
            A=scan.nextDouble();
            B=scan.nextDouble();
            C=scan.nextDouble();

            if(A+B>C && B+C>A && A+C>B){
                double P=A+B+C;
                System.out.printf("Perimetro = %.1f\n",P);
            }else{
                double Z=A+B;
                double Area=0.5*Z*C;
                System.out.printf("Area = %.1f\n",Area);
            }
        }
    }
}