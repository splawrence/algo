public class LengthOfLastWord {
    public static void main(String[] args) {
        String words = " hello dolly ";
        System.out.println("Using split " + lengthOfLastWord(words));
        System.out.println("Using single loop " + lengthOfLastWordSingleLoop(words));
    }

    private static int lengthOfLastWord(String words) {
        String[] wordsArr = words.split(" ");

        return wordsArr[wordsArr.length -1].length();
    }

    private static int lengthOfLastWordSingleLoop(String words) {
        int p = words.length(), length = 0;
        while (p > 0) {
            p--;
            // we're in the middle of the last word
            if (words.charAt(p) != ' ') {
                length++;
            }
            // here is the end of last word
            else if (length > 0) {
                return length;
            }
        }
        return length;
    }
    
}
