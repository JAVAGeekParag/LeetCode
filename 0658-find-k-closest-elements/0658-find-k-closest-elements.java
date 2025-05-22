class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int index = Arrays.binarySearch(arr,x);
        List<Integer> result = new ArrayList<>();
        if(index < 0)
        {
            index = ~(index + 1);
        }
        int left = index;
        int right = index+1;
        int size = 0;
        while(size<k)
        {
            
            if(left>=0 && right<=arr.length-1)
            {
                if(Math.abs(arr[left] - x) <= Math.abs(arr[right] - x))
                {
                    result.add(arr[left]);
                    left--;
                }
                else
                {
                    result.add(arr[right]);
                    right++;
                }
            }
            else if(left>=0)
            {
                result.add(arr[left]);
                left--;
            }
            else
            {
                result.add(arr[right]);
                right++;
            }
            size++;

        }
        Collections.sort(result);
        return result;
        
    }
}