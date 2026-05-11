import java.util.Scanner;
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        
        B5 ans = new B5();
        ans.year(year);
        sc.close();
        
    }
    void year(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
   
}
