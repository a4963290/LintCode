public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        int maxlen = 0;
        int alen = A.length();
        int blen = B.length();
        for(int i=0;i<alen;i++){
            for(int j=0;j<blen;j++){
                int len = 0;
                while(i+len<alen&&j+len<blen&&A.charAt(i+len)==B.charAt(j+len)){
                    len++;
                    if(len>maxlen){
                        maxlen = len;
                    }
                }
            }
        }
        return maxlen;
    }
}
