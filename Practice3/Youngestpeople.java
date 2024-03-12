import java.util.Scanner;

public class Youngestpeople{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of First Person : ");
        int a = sc.nextInt();
        System.out.println("Enter age of Second Person : ");
        int b = sc.nextInt();
        System.out.println("Enter age of Third Person : ");
        int c = sc.nextInt();

        if(a < b && a < c){
            System.out.println("First person is Youngest");
        }else if(a > b && b < c){
            System.out.println("Second person is Youngest");
        }else {
            System.out.println("Third person is Youngest");
        }
    }
}