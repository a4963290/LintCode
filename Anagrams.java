public class Solution {
    int a[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139};
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        ArrayList<String> result = new ArrayList<String>();
        HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
        for(String str : strs){
            int code = 1;
            for(int i=0;i<str.length();i++){
                code = code*a[str.charAt(i)-'a'];
            }
            if(!map.containsKey(code)){
                map.put(code, new ArrayList<String>());
            }
            map.get(code).add(str);
        }
        for(ArrayList<String> tmp:map.values()){
            if(tmp.size()>1){
                result.addAll(tmp);
            }
        }
        return result;
    }
}
