import java.util.Scanner;

public class Square_or_Not{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Length : ");
        int Len = input.nextInt();


        System.out.println("Enter the Breadth : ");
        int Brea = input.nextInt();

        if(Len == Brea){
            System.out.println("It is Square");
        }
        else{
            System.out.println("It is Not a Square");
        }
    }
}