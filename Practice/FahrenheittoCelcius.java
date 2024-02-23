import java.util.Scanner;

public class FahrenheittoCelcius{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature: " + celcius + " degree celcius.");
    }
}