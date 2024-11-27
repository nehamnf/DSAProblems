package Medium;

public class PivotElement {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,2,3}));
    }

    public static int pivotIndex(int[] nums) {

        int sum=0;

        for(int i:nums){
            sum = sum +i;
        }

        int leftSum=0;
        for(int i=0;i < nums.length;i++){
            sum= sum-nums[i];
            if(sum == leftSum){
                System.out.println(i);
                return i;
            }
            leftSum =leftSum +nums[i];
        }
        System.out.println(sum);
        return -1;
    }
}
