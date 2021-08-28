class Solution {
    public int myAtoi(String s) {
        long res=0;
        boolean isPos=true;
        int strt=0;
        
        s=s.trim();
        if(s==null || s.equals(""))
            return (int)res;
        
        if(!Character.isDigit(s.charAt(strt))){
            if(s.charAt(strt)=='+'|| s.charAt(strt)=='-'){
                isPos=s.charAt(strt)=='-' ? false:true;
                strt++;
            }else
                return (int)res;
        }
        
        int len =s.length();
        while(strt<len && Character.isDigit(s.charAt(strt))){
            res= 10*res+(s.charAt(strt)-'0');
            if(isPos && res>=Integer.MAX_VALUE)    return Integer.MAX_VALUE;
            if(!isPos && -res<=Integer.MIN_VALUE)   return Integer.MIN_VALUE;
            strt++;
        }
      
        return (int)(res=isPos? res: -res);
    }
}