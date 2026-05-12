class Solution {
    private String[] digitToChar = {
         "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };
    private List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            return res;
        }
        backTrack(digits, "", 0);
        return res;
        
    }
    private void backTrack(String digits, String currStr, int i){
        if (currStr.length() == digits.length()){
            res.add(currStr);
            return;
        }
        String chars = digitToChar[digits.charAt(i) - '0'];
        for (char c : chars.toCharArray()){
            backTrack(digits, currStr + c, i+1);
        }
    }
}
