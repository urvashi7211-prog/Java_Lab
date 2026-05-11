import java.util.Scanner;

public class C6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int length = str.length();
        System.out.println("Length of string: " + length);

        // String secondHalf = str.substring(length / 2);
        // System.out.println("Second half of string: " + secondHalf);
        for (int i = length / 2; i < length; i++) {
            System.out.print(str.charAt(i));
        }
        

        sc.close();
    }
}