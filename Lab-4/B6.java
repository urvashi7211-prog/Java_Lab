import java.util.Scanner;
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        B6 ans = new B6();
        ans.palindrome(n);
        sc.close();
        
    }
    void palindrome(int n){
        Scanner sc = new Scanner(System.in);
        int rev =0;
        int original = n;
        while(n>0){
            rev = rev * 10 + (n % 10);
            n=n/10;
        }
        if(rev==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrom");
        }
        sc.close();
    }
}
