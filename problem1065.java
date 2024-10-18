import java.io.IOException;
import java.util.Scanner;
public class problem1065 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int []arr=new int[5];
            for (int i=0;i<arr.length;i++){
                arr[i]=scan.nextInt();
            }
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    ++count;
                }
            }
            System.out.println(count+" valores pares");
        }
    }
}