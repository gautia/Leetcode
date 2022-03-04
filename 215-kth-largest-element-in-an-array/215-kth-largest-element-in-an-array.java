class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> array=  new ArrayList<Integer>();

         for (int i : nums) {
            array.add(i);
        }
        return array.get(array.size()-k);
    }
}