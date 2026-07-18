class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length=0;
        

        for(int i=0;i<s.length();i++){
          String current ="";

          for(int j=i;j<s.length();j++){
            char ch = s.charAt(j);

            if(current.indexOf(ch) != -1){
              break;
            }
            current=current+ch;
            max_length=Math.max(max_length,current.length());
          }
        }
        return max_length;
    }
}