class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int count1 = 0;
        int count2 = 0;

        for (int n: nums1) {
            s1.add(n);
        }

        for (int n: nums2) {
            s2.add(n);
        }

        for (int n: nums1) {
            if (s2.contains(n)) count1++;
        }

        for (int n: nums2) {
            if (s1.contains(n)) count2++;
        }

        int[] ans = new int[2];
        ans[0] = count1;
        ans[1] = count2;
        return ans;
    }
}
