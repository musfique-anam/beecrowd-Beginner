import java.util.Scanner;
public class problem1005 {
    public static void main(String[] args) {
        try(Scanner s=new Scanner(System.in)){
            double A=s.nextDouble();
            double B=s.nextDouble();
            double M=((A*3.5)+(B*7.5))/11;
            System.out.println(String.format("MEDIA = %.5f",M));
        }
    }    
}
