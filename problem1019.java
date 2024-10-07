import java.util.Scanner;
public class problem1019 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sec=s.nextInt();

        int pminutes=sec/60;
        int hours=pminutes/60;

        int seconds=sec-(pminutes*60);

        int minutes=pminutes-(hours*60);

        System.out.println(hours+":"+minutes+":"+seconds);
    }    
}
