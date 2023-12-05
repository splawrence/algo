public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "racecar";
        String s2 = "A man, a plan, a canal: Panama";
        
        System.out.println(s + " is a valid palindrome: " + isPalindromeTwoPointer(s));
        System.out.println(s2 + " is a valid palindrome: " + isPalindromeTwoPointer(s2));

        System.out.println(s + " is a valid palindrome: " + isPalindromeStringBuilder(s));
        System.out.println(s2 + " is a valid palindrome: " + isPalindromeStringBuilder(s2));

        System.out.println(s + " is a valid palindrome: " + isPalindromeUsingStreams(s));
        System.out.println(s2 + " is a valid palindrome: " + isPalindromeUsingStreams(s2));
    }

    private static boolean isPalindromeTwoPointer(String s) {
        String sanitized = removeNonAlphanumeric(s);
        int left = 0;
        int right = sanitized.length() - 1;
        while (left < right) {
            if (sanitized.charAt(left) != sanitized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindromeStringBuilder(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    private static boolean isPalindromeUsingStreams(String s) {
        StringBuilder builder = new StringBuilder();

        s.chars()
                .filter(c -> Character.isLetterOrDigit(c))
                .mapToObj(c -> Character.toLowerCase((char) c))
                .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }

    private static String removeNonAlphanumeric(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                result.append(currentChar);
            }
        }
        return result.toString().toLowerCase();
    }
}
