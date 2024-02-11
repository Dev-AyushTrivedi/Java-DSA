public class AssignmentOperator {
    public static void main(String[] args) {
        int A = 10;
        // A = A + 10;
        A += 10; // no difference between = amd += but += it excutes faster.
        System.out.println(A);

        int B = 20;
        // B = B - 20;
        B -= 20; // no difference between = amd += but += it excutes faster.
        System.out.println(B);

        int C = 30;
        // C = C * 30;
        C *= 30; // no difference between = amd += but += it excutes faster.
        System.out.println(C);

        int D = 40;
        // D = D / 40;
        D /= 40; // no difference between = amd += but += it excutes faster.
        System.out.println(D);
    }
}
