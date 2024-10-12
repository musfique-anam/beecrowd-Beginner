//Beginner Problem - 1079 : Weighted Averages
/*
 * 
 * 
 * DIDNT SOLVED THIS.................................
 * 
 * 
 */
import java.io.IOException;
import java.util.Scanner;
public class problem1079 {
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            String input =scan.nextLine();
            String [] N=input.split(" ");
            int size=N.length;
            System.out.println(size);
            if (size==1){
                double n1=Double.parseDouble(N[0]);
                double w1=n1*2;
                double avg1=w1/2;
                System.out.printf("%.1f",avg1);
            }else if(size==2){
                double n1=Double.parseDouble(N[0]);
                double w1=n1*2;
                double n2=Double.parseDouble(N[1]);
                double w2=n2*3;
                double avg2=(w1+w2)/9;
                System.out.printf("%.1f",avg2);
            }else {
                double n1=Double.parseDouble(N[0]);
                double w1=n1*2;
                double n2=Double.parseDouble(N[1]);
                double w2=n2*3;
                double n3=Double.parseDouble(N[2]);
                double w3=n3*5;
                double avg3=(w1+w2+w3)/9;
                System.out.printf("%.1f",avg3);
            } 
        }       
    }
}
