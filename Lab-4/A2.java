import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        A2 obj=new A2();
        obj.odd_even(n);
        sc.close();
        
    }
    void odd_even(int n){
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
