
public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b*a);

        short d = 25;
        byte e = 25;
        char c = 'c';
        byte bt = (byte) (d + e + c);
        System.out.println(bt);

        int i = 10;
        float j = 20.50f;
        long k = 25;
        double l = 30;
        double ans = i + j + k + l;
        System.out.println(ans);
    }
}
