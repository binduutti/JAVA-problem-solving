/* 
write a program to determine if ransom note can be constructed from magazine.
Each letter in magazine can only be used once in ransom note.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
 */
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                System.out.println(false);
                return;
            }
            map.put(c, map.get(c) - 1);
        }
        System.out.println(true);
    }
}
