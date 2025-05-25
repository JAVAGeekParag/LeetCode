class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[index+1];
        while(i<=j)
        {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];
            if(left>right)
            {
                result[index] = left;
                i++;
            }
            else
            {
                result[index] = right;
                j--;
            }
            index--;
        }
        return result;

        
    }
}