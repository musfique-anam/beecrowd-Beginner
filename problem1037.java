//Beginner Problem-1037 : Interval
import java.io.IOException;
import java.util.Scanner;
public class problem1037 {

    public void interval(double input){
        if (input>=0 && input <=25){
            System.out.println("Intervalo [0,25]");
        }else if(input>25 && input <=50){
            System.out.println("Intervalo (25,50]");
        }else if(input>50 && input <=75){
            System.out.println("Intervalo (50,75]");
        }else{
            System.out.println("Intervalo (75,100]");
        }
    }
    
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
           double input=scan.nextDouble();
           problem1037 ob=new problem1037();
           if(input<0 || input>100){
                System.out.println("Fora de intervalo");
           }else{
                ob.interval(input);
           }             
        }
    }
}