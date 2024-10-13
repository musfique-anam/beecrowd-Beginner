//Beginner Problem - 1114 : Fixed Password
import java.io.IOException;
import java.util.Scanner;
public class problem1114 {
        public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int p=scan.nextInt();
            while(p!=2002){                
                System.out.println("Senha Invalida"); 
                p=scan.nextInt();
            }
            System.out.println("Acesso Permitido");
        }
    }
}
