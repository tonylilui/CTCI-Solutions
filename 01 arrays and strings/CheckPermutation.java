public class CheckPermutation {
    public static boolean isPermutation(String one, String two) {
        one = one.toLowerCase();
        two = two.toLowerCase();
        if (one.length() != two.length()) {
            return false;
        }
        return sort(one).equals(sort(two));

    }

    public static String sort(String s) {
        char[] stringContent = s.toCharArray();
        java.util.Arrays.sort(stringContent);
        return new String(stringContent);
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("hi", "hi"));
    }
}
