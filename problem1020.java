import java.io.IOException;
import java.util.Scanner;
public class problem1020 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int given=scan.nextInt();

            int pmonths=given/30;
            int year=pmonths/12;
    
            int smonths=given-(year*365);
            int months=smonths/30;
            int days=smonths-(months*30);
    
            System.out.println(year+" ano(s)");
            System.out.println(months+" mes(es)");
            System.out.println(days+" dia(s)");
        }
    }
}
