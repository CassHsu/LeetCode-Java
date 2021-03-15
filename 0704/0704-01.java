class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            var mid: Int = (l + r) / 2;
            if (nums[mid] == target) return mid
            
            if (target < nums[mid]) {
                r = mid - 1
            } else {
                l = mid + 1
            }
        }
        return -1
    }
}
