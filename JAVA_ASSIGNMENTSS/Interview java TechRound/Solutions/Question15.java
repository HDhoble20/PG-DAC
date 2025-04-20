package question07;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the basic salary of the employee: ");
        double basic = sc.nextDouble();

        double hra, da, grossSalary;

        if (basic < 1500) {
            hra = 0.10 * basic;
            da = 0.90 * basic;
        } else {
            hra = 500;
            da = 0.98 * basic;
        }

        grossSalary = basic + hra + da;

        System.out.println("Gross Salary = Rs. " + grossSalary);
        sc.close();
    }
}
