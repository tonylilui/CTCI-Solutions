public class StringRotation {

    public static boolean stringRotation(String str1, String str2) {
        String allshifted = str1 + str1;
        return allshifted.contains(str2);
    }

    public static void main(String[] args) {
        System.out.println(stringRotation("waterbottle", "bottlewater"));
    }
}
