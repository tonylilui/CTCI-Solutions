public class PalindromePermutation {
    public static boolean palindromePermutation(String str) {
        str = str.replace(" ", "");
        String sorted = sort(str);
        int doubleCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char current = sorted.charAt(i);
            char next = sorted.charAt(i + 1);
            if (current == next) {
                doubleCount++;
            }
        }
        if (doubleCount == str.length() / 2) {
            return true;
        } else {
            return false;
        }
    }

    public static String sort(String str) {
        char[] strChars = str.toCharArray();
        java.util.Arrays.sort(strChars);
        return new String(strChars);
    }

    public static void main(String[] args) {
        System.out.println(palindromePermutation("tact coa"));
    }
}
