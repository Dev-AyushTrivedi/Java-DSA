public class LogicOperator {
    public static void main(String[] args) {

        //   ----------- Logical AND --------------
        System.out.println("Logical AND");
        System.out.println((3>2) && (5>2));
        System.out.println((3>2) && (5<2));
        System.out.println((3<2) && (5>2));
        System.out.println((6<2) && (4<2));


        //   ----------- Logical OR --------------
        System.out.println("Logical OR");
        System.out.println((3>2) || (5>2));
        System.out.println((3>2) || (5<2));
        System.out.println((3<2) || (5>2));
        System.out.println((6<2) || (4<2));

        //   ----------- Logical NOT --------------
        System.out.println("Logical NOT");
        System.out.println(!(3<2));
        System.out.println(!(3>2));

    }
}
