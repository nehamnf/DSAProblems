package Easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{10}));
    }

    public static int removeDuplicates(int[] nums) {

        int res =1;

        for(int i=1;i < nums.length;i++){
            System.out.println(nums[i]);
            if(nums[i-1] != nums[i]){
                nums[res]= nums[i];
                res++;
            }
        }
        return res;
    }
}
