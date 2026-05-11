import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 sub marks:");
        float m1= sc.nextFloat();
        float m2= sc.nextFloat();
        float m3= sc.nextFloat();
        float m4= sc.nextFloat();
        float m5= sc.nextFloat();

        float Percentage = ((m1+m2+m3+m4+m5)*100)/500;

        A1 result = new A1();
        result.division(Percentage);
        sc.close();
        
    }
    void division(float Percentage){
        if(Percentage>=60){
            System.out.println("First Division");
        }
        else if(Percentage>=50 && Percentage<60){
            System.out.println("Second Division");
        }
        else if(Percentage>=40 && Percentage<50){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}
