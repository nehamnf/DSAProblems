package Easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,0,0,12,0});
    }

    public static void moveZeroes(int[] nums) {

        int i=0;

        for(int j=0;j < nums.length;j++){
            if (nums[j] != 0 ){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
