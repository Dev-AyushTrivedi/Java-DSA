public class PrimeorNot {
    public static boolean isPrime(int n){

        //corner case
        //1
        if(n == 2){
            return true;
        }
        for(int i = 2; i < n-1; i++){
            if(n%i == 0){
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
