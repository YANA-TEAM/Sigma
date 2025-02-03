public class Largest {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length-1; i++){
            if(largest <= arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Largest Number in Java is :"+largest(arr));
    }    
}
