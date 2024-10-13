import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class problem1042 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int []array=new int[3];
            for(int i=0;i<3;i++){
                array[i]=scan.nextInt();
            }
            int a=array[0];
            int b=array[1];
            int c=array[2];
            Arrays.sort(array);
            for(int i=0;i<3;i++){
                System.out.println(array[i]);
            }
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}