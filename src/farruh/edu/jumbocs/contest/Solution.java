package farruh.edu.jumbocs.contest;

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int firstIndex = 0;
        int lastIndex = s.length() - 1;

        while (true) {
            System.out.println(firstIndex +" " + lastIndex);
            if (Character.isDigit(s.charAt(firstIndex)) || Character.isLetter(s.charAt(firstIndex))
                    && Character.isDigit(s.charAt(lastIndex)) || Character.isLetter(s.charAt(lastIndex))) {
                if (s.charAt(firstIndex) == s.charAt(lastIndex)) {
                    firstIndex++;
                    lastIndex++;
                } else {
                    return false;
                }
            }

            if (!Character.isDigit(s.charAt(firstIndex)) && !Character.isLetter(s.charAt(firstIndex))) {
                firstIndex++;
            }
            if (!Character.isDigit(s.charAt(lastIndex)) && !Character.isLetter(s.charAt(lastIndex))) {
                lastIndex++;
            }
            if (firstIndex > lastIndex) {
                return true;
            }

        }

        
    }

    public static void main(String[] args) {
        new Solution().isPalindrome("A man, a plan, a canal: Panama");
    }
}