public class URLify {
    public static String urlify(String str) {
        str = str.replace("", "%20");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(urlify("h i "));
    }
}
