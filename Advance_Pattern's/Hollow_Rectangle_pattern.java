import java.util.Scanner;
public class Hollow_Rectangle_pattern {
    public static void rectangle(int tolRow, int tolCol){

        for(int i=1; i<=tolRow; i++){
            for(int j=1; j<=tolCol; j++){
                if(i == 1 || i == tolRow || j == 1 || j == tolCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter no of Columns: ");
        Scanner sc = new Scanner(System.in);
        int tolCol=sc.nextInt();
        System.out.println();

        rectangle(tolCol, tolCol);
    }
}
