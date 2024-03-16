import java.util.Scanner;

public class ServiceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Sex (M/F): ");
        char sex = sc.next().charAt(0);
        System.out.println("Enter your Marital Status (Y/N): ");
        char status = sc.next().charAt(0);

        if(sex == 'F' || sex == 'f') {
            System.out.println("Place of service: Urban Areas");
        }else if(sex == 'M' || sex == 'm') {
            if(age >=20 && age <=40){
                System.out.println("Place of service: Anywhere");
            }else if(age >=40 && age <=60){
                System.out.println("Place of service: Urban Areas");
            }else{
                System.out.println("Invalid Age");
            }
        }else{
            System.out.println("Invalid Sex");
        }
    }
}
