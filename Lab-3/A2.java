import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="continue";
        while(true){
            if(str.equals("exit")){
                break;
            }
            else{
                System.out.println("Enter a,b:");
                int a= sc.nextInt();
                int b= sc.nextInt();
                System.out.print("Enter operator (+, -, *, /, %): ");
                char operator = sc.next().charAt(0);

                switch (operator) {
                    case '+':
                        System.out.println("answer="+(a+b));
                        break;
                    case '-':
                        System.out.println("answer="+(a-b));
                        break;
                    case '*':
                        System.out.println("answer="+(a*b));
                        break;
                    case '/':
                        System.out.println("answer="+(a/b));
                        break;
                    case '%':
                        System.out.println("answer="+(a%b));
                        break;
                    default:
                        break;
                }

            }
            System.out.println("If you want to continue than enter continue else enter exit to exit");
            str= sc.next();
        }
        sc.close();
    }
}
