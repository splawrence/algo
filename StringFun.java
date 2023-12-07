public class StringFun {
    public static void main(String[] args) {
        System.out.println(actualString());
    }

    private static char[] myString() {
        char[] asdf = {'s','t','e','p','h','e','n'};
        return asdf;
    }

    private static String actualString() {
        String s = "s";
        
        return s.concat(s);
    }
}
