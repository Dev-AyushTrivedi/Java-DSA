public class Practice1{
    public static void main(String[] args) {
        int [][] arr = {{4,7,8},{8,8,6}};

        int countOf7 = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[0][j]==7){
                    countOf7++;
                }
                
            } 
        }
        System.out.println("count of 7 " + countOf7);
    }
}