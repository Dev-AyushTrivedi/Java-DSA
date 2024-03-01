
// Take name, roll number and field of interest from user and print in the format below :
// Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.


import java.util.*;;

public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        int roll = input.nextInt();
        String fields = input.next();
        
        System.out.println("Hey My name is " + name + " , My roll number is " + roll + " and my field of interest is " + fields + ".");
    }
}
