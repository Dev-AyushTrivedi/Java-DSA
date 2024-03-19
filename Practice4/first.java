// Take 10 integers from keyboard using loop and print their average value on the screen.

import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 0;
        for(int i=0;i<=10;i++){
            System.out.println("Enter Number: ");
            n = n+sc.nextInt();
        }
        System.out.println("Inputed number is : "+n);
    }
}