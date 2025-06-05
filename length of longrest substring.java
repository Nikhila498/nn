class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxLen = 0;
        int left = 0;
        HashSet<Character> charSet = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(charSet.contains(s.charAt(right))){
                // Removing the prev string upto the repeated occurence, sliding out.
                charSet.remove(s.charAt(left));
                left++;
            }
            // Now, prev occurence has been removed. Add it again
            charSet.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;  
    }
}