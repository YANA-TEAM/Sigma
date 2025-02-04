public class SubArrays {
    public static void subArrays(int arr[]){
        int totalSubArray = 0;
        for(int i = 0; i <= arr.length-1; i++){
            for(int j = i; j <= arr.length-1; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
                totalSubArray++;
        }
        System.out.println();
    }
    System.out.println("Total subArrays are :"+totalSubArray);
}
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
