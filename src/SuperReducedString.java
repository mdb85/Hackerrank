import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 20/04/17.
 */
public final class SuperReducedString {
    private final String s;

    public SuperReducedString(String s) {
        this.s = requireNonNull(s);
    }

    public String reduce() {
        if (s.length() == 1)
            return s;

        String reduced = s;
        boolean found = true;
        while (found) {
            found = false;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < reduced.length(); i++) {
                if (i == reduced.length() - 1 || reduced.charAt(i) != reduced.charAt(i+1)) {
                    sb.append(reduced.charAt(i));
                } else {
                    i++;
                    found = true;
                }
            }
            reduced = sb.toString();
        }

        if (reduced.isEmpty())
            return "Empty String";

        return reduced;
    }
}
