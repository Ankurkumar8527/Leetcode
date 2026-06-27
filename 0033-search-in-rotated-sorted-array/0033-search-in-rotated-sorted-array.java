class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int index = 0;
        if (n <= 2) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == target)
                    return i;
            }
            return -1;
        }

        int li = 1;
        int hi = n - 2;
        while (li <= hi) {
            int mid = li + (hi - li) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                index = mid;
                break;
            } else if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                index = mid - 1;
                break;
            } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                if (nums[mid] > nums[n - 1])
                    li = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        int li1 = 0;
        int hi1 = index;
        while (li1 <= hi1) {
            int mid = li1 + (hi1 - li1) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                hi1 = mid - 1;
            else
                li1 = mid + 1;
        }
        int li2 = index + 1;
        int hi2 = n - 1;
        while (li2 <= hi2) {
            int mid = li2 + (hi2 - li2) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                hi2 = mid - 1;
            else
                li2 = mid + 1;
        }
        return -1;
    }
}