/*
 * A phrase is a palindrome if, after converting all uppercase 
 * letters into lowercase letters and removing all non-alphanumeric characters,
 *  it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */



class ValidPalindrome{
    public boolean isPalindrome(String s) {
        // removig non-alphanumeric characters
        String sorted = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        // making the string an array of characters so that we can use pointers
        char[] chars = sorted.toCharArray();
        int start = 0;
        int end = sorted.length() - 1;
        // we are looping each character and the start and end character
        // for each corresponding index should be equal for it to be palindrome
        while(start<end){
            if (chars[start]!= chars[end]){
                return false;
            }
            start++;
            end --;
        }
        return true;
    }
}