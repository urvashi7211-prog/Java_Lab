import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y:");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Area:"+(x*y));
        sc.close();
    }
}
