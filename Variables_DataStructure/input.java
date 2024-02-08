import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // for single input before space use next()
        String input = sc.next();
        System.out.println(input);

        // for multiple input after space and paragraph more use nextLine()
        String name = sc.nextLine();
        System.out.println(name);

        // for taking input as a number or digit use nextInt()
        int number = sc.nextInt();
        System.out.println(number);

        // for inputing any floating value or decimal value use nextFloat()
        float price = sc.nextFloat();
        System.out.println(price);

        // for inputing short value use nextShort()
        short word = sc.nextShort();
        System.out.println(word);

        // for long value use nextLong()
        long meaning = sc.nextLong();
        System.out.println(meaning);

        // for double value use nextDouble()
        double deci = sc.nextDouble();
        System.out.println(deci);

        // for byte type of data use nextByte()
        byte data = sc.nextByte();
        System.out.println(data);

        // for boolean type of data use nextBoolean()
        boolean answer = sc.nextBoolean();
        System.out.println(answer);
    }   

}
