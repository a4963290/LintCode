public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> B = new ArrayList<Long>();
        for(int i=0;i<A.size();i++){
            long tmp = 1;
            for(int j=0;j<A.size();j++){
                if(j==i){
                    tmp = tmp;
                }else{
                    tmp = tmp*A.get(j);
                }
            }
            B.add(tmp);
        }
        return B;
    }
}

