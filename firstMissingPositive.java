public class Solution {
    /**    
     * @param A: an array of integers
     * @return: an integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here
        for(int i=0;i<A.length;i++){
            while(A[i]!=i+1&&A[i]<=A.length&&A[i]>0){
                int tmp = A[A[i]-1];
                if(tmp==A[i]){
                    break;
                }
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]!=i+1){
                return i+1;
            }
        }
        return A.length+1;
    }
}
