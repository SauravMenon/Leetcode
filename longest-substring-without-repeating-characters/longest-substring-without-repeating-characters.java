class Solution {
public int lengthOfLongestSubstring(String s) {

    ArrayList<Character> list = new ArrayList<>();
    
    if(s.length()==0) return 0;
    
    if(s.length()==1) return 1;
    
    int i=0,max=0;
    while(i<s.length())
    {
        for(int j=i;j<s.length();j++)
        {
            if(!list.contains(s.charAt(j)))
            {
                list.add(s.charAt(j));
                max=Math.max(list.size(),max);
            }
            else
                break;
                 
            
        }
        list.clear();
        i++;
    }
    return max;
}
}