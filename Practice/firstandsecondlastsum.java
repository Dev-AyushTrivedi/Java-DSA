public class firstandsecondlastsum {
    public static void main(String[] args) {
        int n, first, second, third, fourth, fifth, sum;
        n=23456;
        first = n/10000;
        n = n%10000;

        second = n/1000;
        n = n%1000;

        third = n/100;
        n = n%100;

        fourth = n/10;
        fifth = n%10;

        sum = first + fourth;
        System.out.println("The sum of First and fourth digit : " + sum);
    }
}
