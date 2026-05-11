import java.util.Scanner;
public class A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]:");
            a[i] = sc.nextInt();
        }
        A2 result = new A2();
        int ans = result.avg(a);
        System.out.println("avg= "+ans);
        sc.close();
    }
    int avg(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        int avg = sum/a.length;
        return avg;
    }
}