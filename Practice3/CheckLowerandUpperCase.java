import java.util.Scanner;

public class CheckLowerandUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Character " + ch + " is lowercase");
        }else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Character " + ch + " is uppercase");
        }else{
            System.out.println("Character " + ch + " is invalid");
        }
    }
}
