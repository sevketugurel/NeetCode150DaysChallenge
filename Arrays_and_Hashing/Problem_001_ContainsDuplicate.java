public class Problem_001_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int key;
        int j;
        for (int i = 1; i < nums.length; i++) {
            key = nums[i];
            j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j]; // büyüğü bir sağa kaydırıyoruz
                j--;
            }
            if (j >= 0 && nums[j] == key) {
                return true; // tekrar eden eleman bulundu
            }
            nums[j + 1] = key;
        }
        return false; // tekrar eden eleman yok
    }

    public static void main(String[] args) {
        Problem_001_ContainsDuplicate solution = new Problem_001_ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 1};

        System.out.println("Test Case 1: " + solution.containsDuplicate(nums1)); // false
        System.out.println("Test Case 2: " + solution.containsDuplicate(nums2)); // true
    }
}