// Beginner_Problem-1049 : Animal
import java.io.IOException;
import java.util.Scanner;

public class problem1049 {

        public static void main(String[] args) throws IOException {
        try(Scanner s=new Scanner(System.in)) {
            String in1,in2,in3;
            in1=s.nextLine();
            in2=s.nextLine();
            in3=s.nextLine();

            problem1049 m = new problem1049();

            if (in1.equals(m1)) {
                m.method1(in2,in3);
            }else if (in1.equals(m2)) {
                m.method2(in2,in3);
            }
        }
    }

    public void method1 (String in2,String in3) {
        if (in2.equals(m1m1)) {
            method3(in3);
        }else if (in2.equals(m1m2)) {
            method4(in3);
        }
    }

    public void method2 (String in2,String in3) {
        if (in2.equals(m2m1)) {
            method5(in3);
        }else if (in2.equals(m2m2)) {
            method6(in3);
        }
    }

    public void method3 (String in3) {
        if (in3.equals(m3m1)) {
            System.out.println(m3m1Result);
        }else if (in3.equals(m3m2)) {
            System.out.println(m3m2Result);
        }
    }

    public void method4 (String in3) {
        if (in3.equals(m4m1)) {
            System.out.println(m4m1Result);
        }else if (in3.equals(m4m2)) {
            System.out.println(m4m2Result);
        }
    }

    public void method5 (String in3) {
        if (in3.equals(m5m1)) {
            System.out.println(m5m1Result);
        }else if (in3.equals(m5m2)) {
            System.out.println(m5m2Result);
        }
    }
    public void method6 (String in3) {
        if (in3.equals(m6m1)) {
            System.out.println(m6m1Result);
        }else if (in3.equals(m6m2)) {
            System.out.println(m6m2Result);
        }
    }

    private static final String m1="vertebrado";
    private static final String m2="invertebrado";
    private static final String m1m1="ave";
    private static final String m1m2="mamifero";
    private static final String m2m1="inseto";
    private static final String m2m2="anelideo";
    private static final String m3m1="carnivoro";
    private static final String m3m2="onivoro";
    private static final String m4m1="onivoro";
    private static final String m4m2="herbivoro";
    private static final String m5m1="hematofago";
    private static final String m5m2="herbivoro";
    private static final String m6m1="hematofago";
    private static final String m6m2="onivoro";
    private static final String m3m1Result="aguia";
    private static final String m3m2Result="pomba";
    private static final String m4m1Result="homem";
    private static final String m4m2Result="vaca";
    private static final String m5m1Result="pulga";
    private static final String m5m2Result="lagarta";
    private static final String m6m1Result="sanguessuga";
    private static final String m6m2Result="minhoca";
}