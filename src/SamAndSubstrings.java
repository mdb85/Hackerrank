import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 11/04/17.
 * Samantha and Sam are playing a game. They have 'N' balls in front of them, each ball numbered from 0 to 9, except
 * the first ball which is numbered from 1 to 9. Samantha calculates all the sub-strings of the number thus formed, one
 * by one. If the sub-string is S, Sam has to throw 'S' candies into an initially empty box. At the end of the game,
 * Sam has to find out the total number of candies in the box, T. As T can be large, Samantha asks Sam to tell
 * T % (109+7) instead. If Sam answers correctly, he can keep all the candies.
 * Sam can't take all this Maths and asks for your help.
 *
 */
public final class SamAndSubstrings {
    private final String number;

    public SamAndSubstrings(String number) {
        this.number = requireNonNull(number);
    }

    public long computeCandiesNumber() {
        long mod = 1000000007;
        long sum = 0;
        long calculation = 0;

        for (int i = 0; i < number.length(); i++) {
            calculation=(calculation * 10 + Character.getNumericValue(number.charAt(i))*(i+1)) % mod;
            sum= (sum + calculation) % mod;
        }
        return sum;
    }
}
