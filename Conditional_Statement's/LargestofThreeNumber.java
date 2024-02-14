import java.util.Scanner;

public class LargestofThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A >= B && A >= C){
            System.out.println("A is greater than B and C");
        }
        else if (B >= C){
            System.out.println("B is greater than C and A");
        }
        else {
            System.out.println("C is greater than A and B");
        }
    }
}
