//Problem - 1040 : Average 3
import java.io.IOException;
import java.util.Scanner;
public class problem1040 {

    public void averageFound(double avg){
        if(avg>=5.0){
            System.out.println("Aluno aprovado.");
        }else if(avg<=4.9){
            System.out.println("Aluno reprovado.");
        }
        System.out.printf("Media final: %.1f\n",avg);
    }

    public static void main(String[] args) throws IOException {
        try(Scanner scan =new Scanner(System.in)){

            double N1,N2,N3,N4,n1,n2,n3,n4,average,exam,num,average2;

            N1=scan.nextDouble();
            N2=scan.nextDouble();
            N3=scan.nextDouble();
            N4=scan.nextDouble();

            n1=N1*2;
            n2=N2*3;
            n3=N3*4;
            n4=N4;

            average=(n1+n2+n3+n4)/10;
            num=Math.floor(average*10)/10;

            System.out.printf("Media: %.1f\n",num);

            problem1040 ob=new problem1040();

            if(average >=7.0){
                System.out.println("Aluno aprovado.");
            }else if(average <5.0){
                System.out.println("Aluno reprovado.");
            }else if(average >=5.0 && average <=6.9){
                System.out.println("Aluno em exame.");
                exam=scan.nextDouble();
                System.out.println("Nota do exame: "+exam);
                average2=(average+exam)/2;
                ob.averageFound(average2);
            }
        }

    }

}