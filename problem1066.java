import java.io.IOException;
import java.util.Scanner;
public class problem1066 {
 
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            int countEven=0,countOdd=0,countPos=0,countNeg=0;
            int array[]=new int[5];
            for(int i=0;i<array.length;i++){
                array[i]=scan.nextInt();
            }
            for(int i=0;i<array.length;i++){
                if(array[i]%2==0){
                    ++countEven;
                }else{
                    ++countOdd;
                }if(array[i]>0){
                    ++countPos;
                }else if(array[i]<0){
                    ++countNeg;
                }
            }
            System.out.println(countEven+" valor(es) par(es)");
            System.out.println(countOdd+" valor(es) impar(es)");
            System.out.println(countPos+" valor(es) positivo(s)");
            System.out.println(countNeg+" valor(es) negativo(s)");
        }
    }

}
 
