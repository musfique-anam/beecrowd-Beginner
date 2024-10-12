//Beginner Problem - 1078 : Multiplication Table
import java.io.IOException;
import java.util.Scanner;
public class problem1078 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            for(int i=1;i<11;i++){
                int z=i*n;
                System.out.println(i+" x "+n+" = "+z);
            }
        }
    }
}

