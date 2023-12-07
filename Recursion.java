public class Recursion {
    public static void main(String[] args[]) {
        System.out.println(sumNumbersToN(5));
    }

    private static int sumNumbersToN(int i) {
        if (i == 1) {
            return 1;
        }
        int val = 1 + sumNumbersToN(i -1);
        System.out.println(val);
        String s = new String("a");
        return val;
    }
}
