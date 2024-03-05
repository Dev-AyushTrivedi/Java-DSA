public class Pairs_Array {
    public static void PrintPairs(int numbers[]){
        int totalPairs = 0;
        for(int i=0; i<numbers.length; i++){
            
            int current = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + totalPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        PrintPairs(numbers);
    } // time = O(n^2) = // n+(n-1)+(n-2)+(n-3)+....... = 1
}
