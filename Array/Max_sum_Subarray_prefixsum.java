public class Max_sum_Subarray_prefixsum {

    public static int subarray_sum(int number[]){
        int curr_sum =  0;
        int max_sum = Integer.MIN_VALUE;
        int prefix_sum[] = new int[number.length];
        prefix_sum[0] = number[0];

        for(int i = 1; i<prefix_sum.length;i++){
                prefix_sum[i] = prefix_sum[i-1] + number[i];
            }

        for(int i = 0; i<number.length;i++){
            for(int j= i; j<number.length;j++){
                curr_sum = i == 0 ? prefix_sum[j] : prefix_sum[j] - prefix_sum[i-1];
                if(max_sum<curr_sum){
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println(max_sum);
        return 0;
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        subarray_sum(number);
    }
}
