import java.util.*;
public class Largest_Number {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  // -infinity value
        int smallest = Integer.MAX_VALUE; // +infinity value

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest number is : " + getLargest(numbers));
    }
}
