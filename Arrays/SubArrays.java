public class SubArrays{
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i <= array.length-1;  i++){
            for(int j = i; j <= array.length-1; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}