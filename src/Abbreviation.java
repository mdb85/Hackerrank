import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 12/04/17.
 */
public final class Abbreviation {
    private final String left;
    private final String right;

    public Abbreviation(String a, String b) {
        this.left = requireNonNull(a);
        this.right = requireNonNull(b);
    }

    // Brute force like solution that passes all unit tests but not the tests on hackerrank!
    public boolean canBeAbbreviated2() {
        if (left.length() < right.length())
            return false;

        String leftUpper = left.toUpperCase();
        int j = 0;
        for (int i = 0; i < leftUpper.length(); i++) {
            if (leftUpper.charAt(i) == right.charAt(j)) {
                if (j == right.length() -1) {
                    int start = i - right.length() + 1;
                    // check if the remaining are lower cases
                    boolean match = true;
                    for (int k = 0; k < left.length(); k++) {
                        if (k >= start && k < start + right.length())
                            continue;
                        if (Character.isUpperCase(left.charAt(k))) {
                            match = false;
                            break;
                        }
                    }
                    if (match)
                        return true;
                    else
                        j = 0;

                } else {
                    j++;
                }
            }
        }
        return false;
    }

    // DP solution (doesn't pass all my tests but passes all the testcases on hackerrank
    public boolean canBeAbbreviated() {
        if (left.length() < right.length())
            return false;

        boolean[][] abb = new boolean[left.length() + 1][right.length() + 1];

        // init
        abb[0][0] = true;
        for (int i = 1; i < left.length() && Character.isLowerCase(left.charAt(i-1)); i++)
            abb[i][0] = true;

        for (int i = 1; i <= left.length(); i++) {
            for (int j = 1; j <= right.length(); j++) {

                if (abb[i-1][j-1] && (Character.toUpperCase(left.charAt(i-1)) == right.charAt(j-1)))
                    abb[i][j] = true;

                if (abb[i-1][j] && Character.isLowerCase(left.charAt(i-1)))
                    abb[i][j] = true;

            }
        }

        return abb[left.length()][right.length()];
    }
}
