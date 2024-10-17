import java.io.IOException;
import java.util.Scanner;
public class problem1067 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int x=scan.nextInt();
            
            for(int i=1;i<x;i+=2){
                System.out.println(i);
            }

            if(x%2!=0){
                System.out.println(x);
            }
        }
    }
}
