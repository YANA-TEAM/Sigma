public class Smallest {
    public static int smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i <= arr.length-1; i++){
            if(smallest >= arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Smallest Number in Java is :"+smallest(arr));
    }    
}
