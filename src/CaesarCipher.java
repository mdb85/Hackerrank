import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 20/04/17.
 */
public final class CaesarCipher {
    private final int k;
    private final String s;

    public CaesarCipher(int k, String s) {
        this.k = k;
        this.s = requireNonNull(s);
    }

    public String cipher() {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                char cc = shift(c);
                sb.append(cc);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private char shift(char c) {
        boolean isLowerCase = Character.isLowerCase(c);
        char low  = isLowerCase ? 'a' : 'A';
        char high = isLowerCase ? 'z' : 'Z';

        int kk = k % 26;

        int v = (c + kk) % (high + 1);
        if (v < low)
            return (char) (v + low);

        return (char) v;
    }
}
