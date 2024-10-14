import java.io.IOException;
import java.util.Scanner;
public class problem1060 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            double []array=new double[6];
            for(int i=0;i<array.length;i++){
                array[i]=scan.nextDouble();
            }
            int count=0;
            for(int i=0;i<array.length;i++){
                if(array[i]>0){
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
 
}