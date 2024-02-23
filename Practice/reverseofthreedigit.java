public class reverseofthreedigit {
    public static void main(String[] args) {
        int n, first, second, third, reverseNumber;
        n = 123;
        first = n/100;
        n = n%100;

        second = n/10;
        third = n%10;

        reverseNumber = third*100+second*10+first;
        System.out.println(reverseNumber);
    }
}
