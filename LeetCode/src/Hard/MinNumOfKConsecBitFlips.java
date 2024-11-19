package Hard;

public class MinNumOfKConsecBitFlips {

    public static void main(String[] args) {
        minKBitFlips(new int[]{0,0,0,1,0,1,1,0},3);
    }

    public static int minKBitFlips(int[] nums, int k) {
        int currentFlips = 0;
        int totalFlips = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (i >= k && nums[i - k] == 2) {
                currentFlips--;
            }

            if ((currentFlips % 2) == nums[i]) {
                if (i + k > nums.length) {
                    return -1;
                }
                nums[i] = 2;
                currentFlips++;
                totalFlips++;
            }
        }
        return totalFlips;
    }
}
