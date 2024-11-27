package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsProb {
    public static void main(String[] args) {

        System.out.println(subsets(new int[]{1,2,2  }));
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> resultSet= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(),resultSet);
        return resultSet;
    }

    public static void backtrack(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> resultSet){
        resultSet.add(new ArrayList<>(currentSubset));

        for(int i=start;i < nums.length;i++){
            if (i != start && nums[i] == nums[i - 1]) {
                continue;
            }
            currentSubset.add(nums[i]);
            backtrack(nums,i+1,currentSubset,resultSet);
            currentSubset.remove(currentSubset.size()-1);
        }
    }
}
