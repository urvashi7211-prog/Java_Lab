import java.util.Scanner;
public class A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour:");
        double h = sc.nextDouble();
        System.out.println("Enter min:");
        double m = sc.nextDouble();
        double am ;
        double ah;
        am = m*6;
        ah = (h*30) +(m*0.5);
        System.out.println("Angle: "+Math.abs(ah-am));
        sc.close();
    }
}