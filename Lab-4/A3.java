import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        A3 result = new A3();
        result.maximum(a, b, c);
       
        sc.close();
        
    }
    void maximum(int a,int b,int c){
        int ans = (a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println("maximum= "+ans);
    }
}
