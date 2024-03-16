import java.util.Scanner;

public class Attendance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Classes held: ");
        int ClassesHeld = sc.nextInt();

        System.out.println("Enter number of Classes you attended : ");
        int attendedClasses = sc.nextInt();

        float AttendancePercentage = (float) attendedClasses / ClassesHeld * 100;

        System.out.println("Percentage of Attendances : " + AttendancePercentage);

        if(AttendancePercentage<75){
            System.out.println("You are not allowed to sit in Exam.");
        }else{
            System.out.println("You are allowed to sit in Exam.");
        }

    }
}