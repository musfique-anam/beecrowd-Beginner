//Beginner Problem - 1050 : DDD
import java.io.IOException;
import java.util.Scanner;
public class problem1050 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int DDD=scan.nextInt();
            switch (DDD) {
                case 61 -> System.out.println("Brasilia");
                case 71 -> System.out.println("Salvador");
                case 11 -> System.out.println("Sao Paulo");
                case 21 -> System.out.println("Rio de Janeiro");
                case 32 -> System.out.println("Juiz de Fora");
                case 19 -> System.out.println("Campinas");
                case 27 -> System.out.println("Vitoria");
                case 31 -> System.out.println("Belo Horizonte");
                default -> System.out.println("DDD nao cadastrado");
            }
        }
    }
}
