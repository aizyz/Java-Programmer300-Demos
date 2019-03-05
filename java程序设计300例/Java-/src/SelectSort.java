public class SelectSort {
    public static int[] orderby(int [] nums,String str) {
        if (str.equalsIgnoreCase("desc")) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        } else if (str.equalsIgnoreCase("esc")) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = orderby(new int[]{1, 2, 42, 5, 24, 56, 14, 23, 65, 88}, "esc");
        for (int n = 0; n < nums.length; n++) {
            System.out.print(nums[n] + ",");
        }
    }
}




