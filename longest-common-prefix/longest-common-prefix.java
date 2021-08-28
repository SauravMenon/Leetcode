class Solution {
public String longestCommonPrefix(String[] arr) {
String ans="";

    for(int i=0;i<arr[0].length();i++)
    { 
        int flag=0;
        for(int j=1;j<arr.length;j++)
        {
            if(i<arr[j].length()&&arr[0].charAt(i)==arr[j].charAt(i))
                continue;
            else 
            {
                flag=1;break;
            }
        }  
        if(flag==0)
            ans+=arr[0].charAt(i);
        else break;
        
       
        
    }
    return ans;
    
}
}