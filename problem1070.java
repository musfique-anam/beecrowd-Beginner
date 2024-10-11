import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int x=scan.nextInt();
            int a[]=new int[5];
            if(x%2==0){
                x=x+1;
                System.out.println(x);
            }else
                System.out.println(x);
            
            for(int i=0;i<a.length;i++){
                x=x+2;
                System.out.println(x);
            }
        }
    }
 
}