import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 11/04/17.
 *
 * We consider a word, , to be beautiful if the following two conditions are satisfied:
 * No two consecutive characters are the same.
 * No two consecutive characters are in the following vowel set: a, e, i, o, u, y. Note that we consider y to be a vowel in this challenge.
 *
 */
public final class BeautifulWord {
    private static final char A = 'a';
    private static final char E = 'e';
    private static final char I = 'i';
    private static final char O = 'o';
    private static final char U = 'u';
    private static final char Y = 'y';

    private final String word;

    public BeautifulWord(String word) {
        this.word = requireNonNull(word);
    }

    public boolean isBeautiful() {
        if (word.isEmpty())
            return true;
        if (word.length() == 1)
            return true;
        for (int i = 0; i < word.length() - 1; i++) {
            char c1 = word.charAt(i);
            char c2 = word.charAt(i+1);

            if (c1 == word.charAt(i+1))
                return false;

            if (characterIsAVowel(c1) && characterIsAVowel(c2))
                return false;
        }
        return true;
    }

    private boolean characterIsAVowel(char c) {
        return c == A ||
               c == E ||
               c == I ||
               c == O ||
               c == U ||
               c == Y;
    }
}
