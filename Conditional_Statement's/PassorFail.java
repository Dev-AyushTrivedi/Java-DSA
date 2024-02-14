import java.util.Scanner;

public class PassorFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String Status = ((marks >= 33))? "You are Pass" : "You are Fail, try next year.";
        System.out.println(Status);

    }
}
