import java.util.*;

class Solution{
    public static int longest(String s){
        int n = s.length();
        int right = 0;
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(right < n){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                if(map.get(ch) >= left){
                    left = map.get(ch) + 1;
                }
            }
            max = Math.max(max, right-left+1);
            map.put(ch, right);
            right++;
        }
        return max;
    }
}