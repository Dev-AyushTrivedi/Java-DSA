import java.util.*;;

public class Practice10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double a = userInput.nextDouble();
        double b = userInput.nextDouble();

        double area = a*b;

        System.out.println((int)area);
    }
}
