public class ProductExceptiSelf {
    public int[] productExceptiSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Calculate prefix products
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefixProduct; // Set the prefix product for index i
            prefixProduct *= nums[i];   // Update the prefix product
        }

        // Step 2: Calculate suffix products and finalize the answer
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffixProduct; // Multiply with the suffix product
            suffixProduct *= nums[i];    // Update the suffix product
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductExceptiSelf solution = new ProductExceptiSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptiSelf(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
