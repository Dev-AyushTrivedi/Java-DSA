import java.util.*;;
public class Number1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            System.out.println(counter+" ");
            counter++;
        }
    }
}
