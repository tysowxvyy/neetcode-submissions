class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();

        for (char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (int r = 0; r < s2.length(); r++){
         Map<Character, Integer> map2 = new HashMap<>();
            int curr = 0;
            for(int j = r; j < s2.length(); j++){
                char c = s2.charAt(j);
                map2.put(c, map2.getOrDefault(c, 0)+ 1);
                if(map1.getOrDefault(c, 0) < map2.get(c)){
                    break;
                }
                if(map1.getOrDefault(c, 0) == map2.get(c)){
                    curr++;
                }
                if(curr == map1.size()){
                    return true;
                }

            }
        }
        return false;
    }
}

