import java.util.Scanner;
public class A3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]:");
            a[i] = sc.nextInt();
        }
        A3 result = new A3();
        result.Reverse(a);
        sc.close();
    }
    
    void Reverse(int[] a){
        for(int i=(a.length)-1;i>=0;i--){
            System.out.println(" a["+i+"]:"+ a[i]);
        }
    }
}