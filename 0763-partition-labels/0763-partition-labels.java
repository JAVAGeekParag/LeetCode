class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int[] ending = new int[26];
        for(int i = 0;i<s.length();i++)
        {
            int index = s.charAt(i) - 'a';
            ending[index] = i;
        }
        List<Integer> result = new ArrayList<Integer>();
        int curr_max = -1;
        int j = 0;
        for(int i = 0;i<s.length();i++)
        {
            int temp_max = ending[s.charAt(i) - 'a'];
            curr_max = Math.max(curr_max,temp_max);
            if(i == curr_max)
            {
                curr_max = -1;
                result.add(i-j+1);
                j = i+1;
            }
        }
        return result;


    }
}