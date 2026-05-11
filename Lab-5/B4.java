import java.util.Scanner;
public class B4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]:");
            a[i] = sc.nextInt();
        }
        B4 result = new B4();
        result.copy(a,b);
        sc.close();
    }
    void copy(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.println("b["+i+"]:"+b[i]);
        }
    }
    
}