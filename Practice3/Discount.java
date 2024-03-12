import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the quantity Value : ");
        int value = userInput.nextInt();

        if((value*100) > 1000){
            System.out.println("Discounted value = " + (value*100-(.1*value*100)));
        }else{
            System.out.println("No Discount given = " + value);
        }
    }
}