import java.util.Scanner;

class Employee {
    String name;
    String jobTitle;
    double salary;

    void setEmployee(String n, String jt, double s) {
        name = n;
        jobTitle = jt;
        salary = s;
    }

    void displayEmployee() {
        System.out.println("Name: " + name + 
                           ", Job Title: " + jobTitle + 
                           ", Salary: " + salary);
    }

    void updateSalary(double amount) {
        salary += amount;
        System.out.println("Updated Salary for " + name + ": " + salary);
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee();

        System.out.println("Enter Employee Name, Job Title, and Monthly Salary:");
        String n = sc.nextLine();
        String jt = sc.nextLine();
        double s = sc.nextDouble();

        emp1.setEmployee(n, jt, s);

        emp1.displayEmployee();

        System.out.println("Enter amount to increase salary:");
        double inc = sc.nextDouble();
        emp1.updateSalary(inc);

        System.out.println("Annual Salary of " + emp1.name + ": " + emp1.calculateAnnualSalary());

        sc.close();
    }
}