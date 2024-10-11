//Beginner Problem - 1078 : Multiplication Table
import java.io.IOException;
import java.util.Scanner;
public class problem1078 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int n=scan.nextInt();
            for(int i =2;i<=n;i++){
                if(i%2==0){
                    int z=i*i;
                    System.out.println(i+"^2 = "+z);
                }
            }
        }
    }
}

