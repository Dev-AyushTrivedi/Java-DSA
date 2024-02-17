import java.util.*;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : "); 
        int n = sc.nextInt();

        if(n == 2){
            System.out.print("Number is prime");
        } else {
            boolean isPrime = true;
            for(int i = 2; i <=Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.print("Number is Prime");
            } else{
                System.out.print("Number is not Prime");
            }
        }
        }
}
