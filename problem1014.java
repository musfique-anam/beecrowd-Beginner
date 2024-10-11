import java.io.IOException;
import java.util.Scanner;
public class problem1014 {
    public static void main(String[] args) throws IOException {
        try(Scanner reader=new Scanner(System.in)){
            int X;
            double Y,Z;
            X=reader.nextInt();
            Y=reader.nextDouble();
            Z=X/Y;
            System.out.printf("%.3f km/l\n",Z);
        }
    }
}
