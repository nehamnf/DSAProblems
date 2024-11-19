package Medium;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {

        int low=0,high=nums.length-1,duplicate=-1;

        while (low <= high){
            int mid= low+high/2;

            int count=0;
            for(Integer i:nums){
                if( i <= mid){
                    count++;
                }
            }

            if( count > mid) {
                duplicate = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return duplicate;
    }
}
