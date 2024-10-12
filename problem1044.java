//Beginner Problem - 1044 : Multiples
import java.io.IOException;
import java.util.Scanner;
public class problem1044 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int A=scan.nextInt();
            int B=scan.nextInt();
            if (A<B){
                if (B%A==0){
                    System.out.println("Sao Multiplos");
                }else{
                    System.out.println("Nao sao Multiplos");
                }
            }
            if (A>B){
                 if (A%B==0){
                    System.out.println("Sao Multiplos");
                }else{
                    System.out.println("Nao sao Multiplos");
                }               
            }           
        }
    }
}