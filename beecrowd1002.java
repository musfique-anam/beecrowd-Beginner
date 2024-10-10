package beecrowdBeginner;
import java.util.Scanner;
public class AreaofaCircle_1002 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double R=scan.nextDouble();
        double A=(3.14159*R*R);
        System.out.format("A=%.4f\n",A);
    }
}
