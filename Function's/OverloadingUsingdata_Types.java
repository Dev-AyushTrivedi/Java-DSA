public class OverloadingUsingdata_Types {
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,6));
        System.out.println(sum(6.9f,9.4f));
    }
}
