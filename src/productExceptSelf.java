import java.util.Arrays;

class productExceptSelf {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        productExceptSelf solution = new productExceptSelf();
        int[] nums = {1,2,3,2,3,4};
        System.out.println(solution.containsDuplicate(nums));
    }
}

