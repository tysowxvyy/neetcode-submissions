/**

1: loop through s & t and put it in map


**/

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for (int c = 0; c < s.length(); c++){
            countS.put(s.charAt(c), countS.getOrDefault(s.charAt(c), 0) + 1);
            countT.put(t.charAt(c), countT.getOrDefault(t.charAt(c), 0) + 1);
        }
        return countS.equals(countT);

    }
}
