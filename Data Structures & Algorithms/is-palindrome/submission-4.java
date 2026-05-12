class Solution {
    public boolean isPalindrome(String s) {
        int pointer1 = 0;
        int pointer2 = s.length() -1;

        while (pointer1 < pointer2) {
            if (!Character.isLetterOrDigit(s.charAt(pointer1))) {
                pointer1++;
        }
        else if (!Character.isLetterOrDigit(s.charAt(pointer2))) {
                pointer2--;
            } 
            else {
                if (Character.toLowerCase(s.charAt(pointer1)) != Character.toLowerCase(s.charAt(pointer2))) {
                    return false;
                }
                pointer1++;
                pointer2--;
            }
        }
        return true;
    }
}







