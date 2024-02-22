public class ValueSwap {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);


        // without third variable 

        b = b-a;
        a = b+a;
        b = -(b-a);
        System.out.println(a);
        System.out.println(b);
    }
}
