package Easy;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr= new int[]{2,0,2,1,1,0};
        int[] arr2= new int[]{2,0,0,1,0,2,1,0};
        sortColors(arr);
        sortColors(arr2);
    }

    public static void sortColors(int[] nums) {

        int zero=0;
        int one=0;

        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            }
        }

        System.out.println("zero: "+zero);
        System.out.println("one: "+one);
        for(int i=0;i<zero;i++){
            nums[i]=0;
        }

        for(int i=zero;i<(zero+one);i++){
            nums[i]=1;
        }

        for(int i=(zero+one);i< nums.length;i++){
            nums[i]=2;
        }

        System.out.println(Arrays.toString(nums));
    }
}
