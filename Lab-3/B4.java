import java.util.Scanner;
public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c:");
        double c= sc.nextDouble();
        System.out.println("f="+((c*9/5)+32));
        System.out.println("Enter f:");
        double f= sc.nextDouble();
        System.out.println("c="+((5*(f-32)))/9);
        sc.close();
    }
}
