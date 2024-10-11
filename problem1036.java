import java.io.IOException;
import java.util.Scanner;
public class problem1036 {
        public double root(double a,double b,double c,double A){
        double A1,C1,x1;
        A1=-b+Math.sqrt(A);
        C1=2*a;
        x1=A1/C1;
        return x1;
    }
    
    public double root2(double a,double b,double c,double A){
        double B1,C1,x2;
        B1=-b-Math.sqrt(A);
        C1=2*a;
        x2=B1/C1;
        return x2;
    }
    
    public static void main(String[] args) throws IOException {
        try(Scanner scan=new Scanner(System.in)){
            double a,b,c,A;
            a=scan.nextDouble();
            b=scan.nextDouble();
            c=scan.nextDouble();
            
            if(a==0.0 || b==0.0 || c==0.0){
                A=(-c)/b;
            }else{
                A=(b*b)-(4*a*c);
            }
            problem1036 m=new problem1036();
    
            if(A<=0)
                System.out.println("Impossivel calcular");
            else{
            double x1=m.root(a,b,c,A);
            double x2=m.root2(a, b, c,A);
            System.out.printf("R1 = %.5f\n",x1);
            System.out.printf("R2 = %.5f\n",x2);
            }
        }      
    }
}