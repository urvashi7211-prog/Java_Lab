import java.util.Scanner;
public class C7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] a = new int[size];
        
        
        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]:");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter index:");
        int index = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(index==i){
                 System.out.println("a["+i+"]:"+a[i]);
            }
        }
    sc.close();
    }
}
