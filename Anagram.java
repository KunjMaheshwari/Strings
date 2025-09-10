import java.util.*;

class Solution{
    public static boolean isAnagram(String s1, String s2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }

        for(char ch : s2.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }

        return map1.equals(map2);
    }
}