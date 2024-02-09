import java.util.Scanner;

public class costofIntems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float costofintem1 = sc.nextFloat();
        float costofitem2 = sc.nextFloat();
        float costofitems3 = sc.nextFloat();

        float total = costofintem1 + costofitem2 + costofitems3 ;

        System.out.println("Bill is : " + total);


        float newTotal = total + (0.18f * total);

        System.out.println(newTotal);
    }
}
