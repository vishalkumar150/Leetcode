class Solution {
    public String reverseWords(String s) {
        // Remove spaces from beginning and end
        s = s.trim();
// Split the String into words
        // \\s+ means one or more spaces
        String[] words = s.split("\\s+");
        // Create an empty String for the answer
        String ans = "";
        // Start from the last word
        for (int i = words.length - 1; i >= 0; i--) {
       // Add current word
       ans = ans + words[i];
       // add space between them and dont add space after last word
       if(i!=0)
       {
        ans = ans + " ";
       }
        }
       // Return the reversed words
        return ans;

    }

}