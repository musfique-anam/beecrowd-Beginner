//Problem - 1046 : Game Time
import java.io.IOException;
import java.util.Scanner;
public class problem1046 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan =new Scanner(System.in)){
            int A,B,C,D,E;
            A=scan.nextInt();
            B=scan.nextInt();
            C=24-A;
            D=C+B;
            if(D>24){
                E=D-24;
                System.out.println("O JOGO DUROU "+E+" HORA(S)");
            }else{
                System.out.println("O JOGO DUROU "+D+" HORA(S)");
            }   
        }
    }
}