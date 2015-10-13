public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int i = 0;
        int index = A.length-1;
        while(i<=index){
            if(A[i]==elem){
                A[i]=A[index];
                index--;
            }else{
                i++;
            }
        }
        return index+1;
    }
}

