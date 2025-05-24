class Solution {
    public boolean canTransform(String start, String result) {
        int i = 0;
        int j = 0;
        int n = result.length();
        while(i<n && j<n)
        {
            
            while(i<n && start.charAt(i) == 'X')
            {
                i++;
            }
            while(j<n && result.charAt(j) == 'X')
            {
                j++;
            }
           
            if(i<n && j<n)
            {
                 
                if(start.charAt(i) != result.charAt(j))
                {
                    return false;
                }
                if(start.charAt(i) == 'L' && i<j)
                {
                    return false;
                }
                if(start.charAt(i) == 'R' && i>j)
                {

                    return false;
                }
                i+=1;
                j+=1;
            }
            
            
        }
        while(i<n)
            {
                if(start.charAt(i) != 'X')
                {
                    return false;
                }
                i++;
            }
            while(j<n)
            {
                if(result.charAt(j) != 'X')
                {
                    return false;
                }
                j++;
            }
            return true;
    }
    
}