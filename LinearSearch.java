public class LinearSearch {
    public static void main(String[] args) {
        int[] haystack = {1,2,3,4,5,67,888};
        int needle = 888;

        System.out.println(linearSearch(haystack, needle));
    }
    private static int linearSearch(int[] haystack, int needle) {
        for(int i = 0; i < haystack.length; i++) {
            if(needle == haystack[i]) {
                return i;
            }
        }
        return -1;
    }
}