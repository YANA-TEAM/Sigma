public class LinearSearch {
    public static int linearSearch(int key, int arr[]){
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16};
        int key = 2;
        int index = linearSearch(key, array);
        if(index == -1){
            System.out.println("Key Not Found in Array");
        }
        else{
            System.out.println(key+" is founded in array at index :"+index);
        }
    }
}
