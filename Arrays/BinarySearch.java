public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = arr[0];
        int end = arr.length;
        for(int i = 0; i <= arr.length; i++){    
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return key;
            }
            if(arr[mid] < key){
                start += 1;
            }
            if(arr[mid] > key){
                end-=1;
            }
        }
        return -1;
    }    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        int index = binarySearch(arr, key);
        System.out.println("key is founded at index :"+index);
    }
}
