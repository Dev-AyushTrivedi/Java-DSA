import java.util.Scanner;

public class SalaryBouns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Salary: ");
        int salary = input.nextInt();
        System.out.println("Enter your year of Service: ");
        int yearsofService = input.nextInt();

        double bonus = salary * 0.05;
        if(yearsofService > 5){
            System.out.println("You get bonus = " + bonus);
        }else{
            System.out.println("You are not getting Bonus");
        }
    }
}
