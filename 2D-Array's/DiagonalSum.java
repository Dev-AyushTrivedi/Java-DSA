
// asked in samsung, amazon and microsoft

public class DiagonalSum{
    public static int diagonal(int arr[][]){
        int sum = 0;

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j){
        //             sum += arr[i][j];  // this will give O(n^2) time complexity 
        //         }
        //         else if(i+j == arr.length-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<arr.length; i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i)
                sum+=arr[i][arr.length-i-1];
        } 
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        diagonal(arr);

       
    }
}