public class StringCompression {
    public static String stringCompression(String str) {
        char current = str.charAt(0);
        int counter = 1;
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            char next = str.charAt(i + 1);
            if (current == next) {
                counter++;
            } else {
                result += current;
                result += String.valueOf(counter);
                counter = 1;
            }
            current = next;
        }
        result += current;
        result += String.valueOf(counter);
        counter = 1;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aaaabccc"));
    }
}
