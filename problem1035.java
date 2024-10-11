import java.io.IOException;
import java.util.Scanner;

public class problem1035 {

    public int selection(int A, int B, int C, int D) {
        int E, F, r;
        E = C + D;
        F = A + B;
        if (B > C && D > A && E > F && C >= 0 && D >= 0 && A % 2 == 0) {
            r = -1;
        } else
            r = 1;
        return r;

    }

    public static void main(String[] args) throws IOException {
        try(Scanner scan = new Scanner(System.in)){
            int A, B, C, D, result;
            A = scan.nextInt();
            B = scan.nextInt();
            C = scan.nextInt();
            D = scan.nextInt();
    
            problem1035 m = new problem1035();
            result = m.selection(A, B, C, D);
    
            if (result == -1) {
                System.out.println("Valores aceitos");
            } else {
                System.out.println("Valores nao aceitos");
            }
        }
    }
}