import java.util.*;

class Solution {
    public static int anagram(String s1, String s2) {
        int count = 0;

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : arr1) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : arr2) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            count += Math.abs(entry.getValue());
        }
        return count;
    }
}