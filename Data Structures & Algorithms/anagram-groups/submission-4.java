class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res= new HashMap<>();
        for(String word : strs){
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedS = new String(charArr);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(word);


        }
        return new ArrayList<>(res.values());
    }
    
}
