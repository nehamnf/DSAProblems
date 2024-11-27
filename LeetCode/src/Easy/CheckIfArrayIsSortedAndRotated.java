package Easy;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        System.out.println(check(new int[]{1,1,1,1,1}));
    }

    public static boolean check(int[] nums) {

        int count=0;
        int length= nums.length;



        for(int i=0;i < length;i++){
            if ( nums[i] > nums[(i +1)% length ]){
                count=count+1;
            }
        }
        return ((count == 1) || (count == 0));
    }
}
