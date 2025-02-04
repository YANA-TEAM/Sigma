public class SubArrays {
    public static void subArrays(int arr[]){
        int total = 0;
        int maxSum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            for(int j = i; j <= arr.length-1; j++){
                int currentSum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]);
                    currentSum += arr[k];
                }
                System.out.println();
                System.out.println("Sum is :"+currentSum);
                if(currentSum >= maxSum){
                    maxSum = currentSum;
                }
                total++;
            }
            System.out.println();
        }
        System.out.println("Total subArrays are :"+total);
        System.out.println("Maximum SubArray Sum is :"+maxSum);

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
