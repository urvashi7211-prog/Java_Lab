import java.util.Scanner;

class BankDemo {
    int accNum;
    String accType;
    double balance;

    // setter method
    void setter(int ac, String at, double b) {
        accNum = ac;
        accType = at;
        balance = b;
    }

    // getter method
    void getter() {
        System.out.println("Account Number: " + accNum +  ", Account Type: " + accType +  ", Balance: " + balance);
    }
}

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 2 cubes
        BankDemo[] account = new BankDemo[3];

        // Initialize objects
        for (int i = 0; i < account.length; i++) {
            account[i] = new BankDemo();
            System.out.println("Enter Account Number, Account Type, Balance for Account " + (i+1) + ":");
            
            int ac = sc.nextInt();
            String at = sc.next();
            double b = sc.nextDouble();

            account[i].setter(ac, at, b);
        }

        // Display details and volumes
        for (int i = 0; i < account.length; i++) {
           System.out.print("Account " + (i+1) + " -> ");
            account[i].getter();

        }

        sc.close();
    }
}