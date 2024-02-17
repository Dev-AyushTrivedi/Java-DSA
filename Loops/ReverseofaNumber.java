public class ReverseofaNumber {
    public static void main(String[] args) {
        int n = 110104;

        while( n > 0){
            int LastDigit = n%10;
            System.out.print(LastDigit + " ");
            n = n / 10;
        }
        System.out.println();
    }
}
