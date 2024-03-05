public class Linear_Search{
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
        }
    }
    return -1;
}

public static int linearSearch2(String name[], String key2){
    for(int i=0; i<name.length; i++){
        if(name[i]==key2){
            return i;
    }
}
return -1;
}
    public static void main(String[] args){
        int numbers[] = {2,3,4,6,9,5,8,10,11};
        String name[] = {"Ayush", "Roman", "WWE", "Brock"};
        String key2 = "Roman";
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at index : " +index);
        }

        int index2 = linearSearch2(name, key2);
        if(index2==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at index : " +index2);
        }
    }
}