import java.util.Scanner;
 class Circle {
    double radius;
    double area(){
    return 3.14*radius*radius;
    }
}

public class A1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println("Enter radius:");
         c1.radius=sc.nextDouble();
        double area = c1.area();
        System.out.println("area"+area);
        sc.close();
    }
    
}