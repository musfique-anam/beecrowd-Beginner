//Problem - 1064 : Positives and Average
import java.io.IOException;
import java.util.Scanner;
public class problem1064 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            double []array=new double[6];
            for(int i=0;i<array.length;i++){
                array[i]=scan.nextDouble();
            }
            double count=0;
            double sum =0;
            for(int i=0;i<array.length;i++){
                if(array[i]>0){
                    ++count;
                    sum +=array[i];
                }
            }
            System.out.println(count+" valores positivos");
            double average=(sum/count);
            System.out.printf("%.1f\n",average);
        }
    }
}