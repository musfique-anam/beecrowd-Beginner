//Problem - 1045 : Triangle Types
import java.io.IOException;
import java.util.*;
public class problem1045 {

    public void condition (double A,double B,double C){
        double A2,B2,C2;
        A2=A*A;
        B2=B*B;
        C2=C*C;
        if(A2==(B2+C2)){
            System.out.println("TRIANGULO RETANGULO");
        }if(A2>(B2+C2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }if(A2<(B2+C2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }if(A==B && B==C && A==C){
            System.out.println("TRIANGULO EQUILATERO");
        }else if(A==B || B==C || A==C){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

    public static void main(String[] args) throws IOException {
        try(Scanner scan =new Scanner(System.in)){
            double A,B,C;
            double array[]=new double[3];
            for(int i=0;i<3;i++){
                array[i]=scan.nextDouble();
            }
            Arrays.sort(array);
            A=array[2];
            B=array[1];
            C=array[0];


        problem1045 ob=new problem1045();
            if(A>=B+C){
                System.out.println("NAO FORMA TRIANGULO");
            }else {
                ob.condition(A,B,C);
            }    
        }
    }
}