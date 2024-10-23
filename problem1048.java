//Problem - 1048 : Salary Increase
import java.io.IOException;
import java.util.Scanner;
public class problem1048 {
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner scan=new Scanner(System.in)){
            double salary,fsalary,m,p;
            salary=scan.nextDouble();

            if(salary>=0 && salary<=400.00){
                m=salary*15;
                p=m/100;
                fsalary=p+salary;
                System.out.printf("Novo salario: %.2f\n",fsalary);
                System.out.printf("Reajuste ganho: %.2f\n",p);
                System.out.println("Em percentual: 15 %");
            }else if(salary>=400.01 && salary<=800.00){
                m=salary*12;
                p=m/100;
                fsalary=p+salary;
                System.out.printf("Novo salario: %.2f\n",fsalary);
                System.out.printf("Reajuste ganho: %.2f\n",p);
                System.out.println("Em percentual: 12 %");
            }else if(salary>=800.01 && salary<=1200.00){
                m=salary*10;
                p=m/100;
                fsalary=p+salary;
                System.out.printf("Novo salario: %.2f\n",fsalary);
                System.out.printf("Reajuste ganho: %.2f\n",p);
                System.out.println("Em percentual: 10 %");
            }else if(salary>=1200.01 && salary<=2000.00){
                m=salary*7;
                p=m/100;
                fsalary=p+salary;
                System.out.printf("Novo salario: %.2f\n",fsalary);
                System.out.printf("Reajuste ganho: %.2f\n",p);
                System.out.println("Em percentual: 7 %");
            }else if(salary>=2000.00){
                m=salary*4;
                p=m/100;
                fsalary=p+salary;
                System.out.printf("Novo salario: %.2f\n",fsalary);
                System.out.printf("Reajuste ganho: %.2f\n",p);
                System.out.println("Em percentual: 4 %");
            }
        }
 
    }
 
}