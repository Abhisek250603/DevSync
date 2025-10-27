class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            if(hm.containsKey(s.charAt(end)) && hm.get(s.charAt(end)) >= start){
                start = hm.get(s.charAt(end))+1;
            }
                hm.put(s.charAt(end),end);

            int windowLength = end - start + 1;
            if (windowLength > maxLength) {
                maxLength = windowLength;
            }
        }
        return maxLength;
    }
}
