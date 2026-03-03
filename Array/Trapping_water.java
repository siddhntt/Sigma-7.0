public class Trapping_water {
    public static void volume_trapped(int height[]){
        //Calculate the left Max boudary array
        int left_Max[] = new int[height.length];
        left_Max[0] = height[0];
        for(int i = 1; i<left_Max.length;i++){
            left_Max[i] = Math.max(height[i], left_Max[i-1]);
        }

        //Calculate right max boudary array
        int right_Max[] = new int[height.length];
        right_Max[right_Max.length-1] = height[height.length-1];
        for(int i = right_Max.length -2; i>=0;i--){
            right_Max[i] = Math.max(height[i], right_Max[i+1]);
        }

        //Calculating the area of water trapped
        int water_trapped = 0;
        for(int i = 0; i<height.length;i++){
            int water_level = Math.min(left_Max[i], right_Max[i]);
            water_trapped += (water_level - height[i]); 
        }
        System.out.println(water_trapped);
        
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        volume_trapped(height);
    }
}
