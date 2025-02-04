public class MaxSubArraySum1 {
    public static void maxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length-1; i++){
            for(int j = i; j <= arr.length-1; j++){
                int currentSum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]);
                    currentSum += arr[k];
                }
                System.out.println();
                System.out.println("currentSum is :"+currentSum);
                if(currentSum >= maxSum){
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum SubArray Sum is :"+maxSum);

    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}

