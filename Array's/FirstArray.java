public class FirstArray{
     // call by reference    
    public static void update(int marks2[]){
        for(int i = 0; i < marks2.length; i++){
            marks2[i] = marks2[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[50];

        int numbers[] = {1,2,3,4,5,6,7,8,9,0};

        int moreNumbers[] = {11,22,33,44,55,66,77,88,99,00};

        String fruits[] = {"Apple", "Mengo", "Orange"};
        


        int marks2[] = {97,89,99}; // call by reference
        update(marks2);

        for(int i = 0; i < marks2.length; i++){
            System.out.print(marks2[i]+" ");
        }
        System.out.println();
    }
}