public class MinLength {
    public static String minWindow(String s, String t){
        int minLen = Integer.MAX_VALUE;
        int sIdx = -1;
        int hash[] = new int[256];

        for(char ch : t.toCharArray()){
            hash[ch]++;
        }
        
        int count = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            if(hash[s.charAt(right)] > 0){
                count++;
            }
            hash[s.charAt(right)]--;

            while(count == t.length()){
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    sIdx = left;
                }

                hash[s.charAt(left)]++;

                if(hash[s.charAt(left)] > 0){
                    count--;
                }
                left++;
            }
            right++;
        }
        return (sIdx == -1) ? "" : s.substring(sIdx, sIdx+minLen);
    }
}
