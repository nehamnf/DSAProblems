package Easy;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {

        int result=nums.length;
        for(int i=0;i < nums.length;i++){
            result=result ^ nums[i] ^ i;
        }
        return result;
    }
}
