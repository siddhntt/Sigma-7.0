public class Max_Sum_Subarray_Kadan {

    public static void subarray_sum(int number[]){
        int cs = 0;;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<number.length;i++){
            cs += number[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
            
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        subarray_sum(number);

    }
}
