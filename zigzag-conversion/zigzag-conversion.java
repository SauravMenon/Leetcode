class Solution {
    public String convert(String s, int numRows) {
        int tot = Math.min(numRows,s.length());
       StringBuilder [] ans = new StringBuilder[tot];
        int i = 0;
        while(i<s.length()){
            for(int j=0;j<numRows && i<s.length();j++){
                if(ans[j]==null)
                    ans[j] = new StringBuilder();
                ans[j].append(s.charAt(i++));
            }
            //Avoid first and last row
            for(int j=numRows-2;j>0 && i<s.length();j--){
                 ans[j].append(s.charAt(i++));
            }
        }
       StringBuilder sb = new StringBuilder();
        for(StringBuilder chars: ans){
                sb.append(chars);
        }
        return sb.toString();
    }
}