public class Max_Sum_Subarray_bruteforce {
    public static int subarray_sum(int number[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<number.length;i++){
            for(int j = i; j<number.length;j++){
                for(int k = i; k<=j; k++){
                    System.out.print(number[k]+ " ");
                    curr_sum = curr_sum + number[k];
                }
                if(curr_sum>max_sum){
                    max_sum = curr_sum;
                }
                System.out.println("Sum of this substring is: "+ curr_sum);
                curr_sum = 0;
                
            }
            System.out.println();
        }
        System.out.println("The max sum of subarrays is: "+ max_sum);
        return 0;
    }

    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        subarray_sum(number);
    }
}