import java.util.Scanner;
public class A1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]:");
            a[i] = sc.nextInt();
        }
        A1 result = new A1();
        int ans = result.sum(a);
        System.out.println("sum= "+ans);
        sc.close();
    }
    int sum(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum;
    }
}