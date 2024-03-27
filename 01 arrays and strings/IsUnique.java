public class IsUnique {
    public static boolean isUnique(String str) {
        str = str.toLowerCase();
        char[] dict = new char[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (dict[index] > 0) {
                return false;
            } else {
                dict[index]++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("hih"));
    }
}