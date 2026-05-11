import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        A4 result = new A4();
        result.prime(n);
        sc.close();
    }
    void prime(int n){
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                System.out.println("not prime");
                break;
            }else if(i == n-1) {
                System.out.println("prime");
            }
        }
    }
}