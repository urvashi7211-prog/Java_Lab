import java.util.Scanner;

class Cube{
    double height;
    double width;
    double depth;
void setter(double h,double w,double d){
    height=h;
    width=w;
    depth=d;
}
void getter(){
    System.out.println("Height: " + height + ", Width: " + width + ", Depth: " + depth);
}
double volume(){
    return height*width*depth;
}
}
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cube c1 = new Cube();
        Cube c2 = new Cube();

        System.out.println("Enter cube 1 height,width and depth:");
        double h1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double d1 = sc.nextDouble();
        c1.setter(h1, w1, d1);

        System.out.println("Enter cube 2 height,width and depth:");
        double h2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double d2 = sc.nextDouble();
        c2.setter(h2, w2, d2);

         System.out.print("Cube 1 -> ");
        c1.getter();
        System.out.println("Volume of Cube 1: " + c1.volume());

        System.out.print("Cube 2 -> ");
        c2.getter();
        System.out.println("Volume of Cube 2: " + c2.volume());


       

        System.out.println("Volume of Cube 1: " + c1.volume());
        System.out.println("Volume of Cube 2: " + c2.volume());

        sc.close();
    }

}


