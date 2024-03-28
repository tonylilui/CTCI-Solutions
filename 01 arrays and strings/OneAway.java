public class OneAway {
    public static boolean oneAway(String strOne, String strTwo) {
        if (strOne.length() == strTwo.length()) {
            return checkEditReplacement(strOne, strTwo);
        } else if (strOne.length() > strTwo.length()) {
            return checkEditInsertionOrRemoval(strOne, strTwo);
        } else if (strTwo.length() > strOne.length()) {
            return checkEditInsertionOrRemoval(strTwo, strOne);
        }

        return false;
    }

    public static boolean checkEditReplacement(String strOne, String strTwo) {
        boolean foundDifference = false;
        for (int i = 0; i < strOne.length(); i++) {
            if (strOne.charAt(i) != strTwo.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static boolean checkEditInsertionOrRemoval(String strOne, String strTwo) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < strTwo.length() && index1 < strOne.length()) {
            if (strOne.charAt(index1) != strTwo.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("pale", "pal"));
    }
}
