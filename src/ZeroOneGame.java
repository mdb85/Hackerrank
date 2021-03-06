import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 12/04/17.
 * Alice and Bob are playing the following game:

 The game starts with a sequence of zeroes and ones.
 Alice and Bob take alternating turns, and Alice always moves first.
 During each turn, a player removes one element from the sequence that satisfies the following:
 It is not the first or last element.
 It must be surrounded by zeroes on both sides.
 The first player who can't take their turn loses the game.
 Both players always move optimally.

 */
public final class ZeroOneGame {
    static final String ALICE = "Alice";
    static final String BOB = "Bob";

    private int[] sequence;

    public ZeroOneGame(int[] sequence) {
        this.sequence = requireNonNull(sequence);
    }

    public String computeWinner() {
        if (sequence.length < 2)
            return BOB;

        int totalMoves = 0;
        int moves = 0;

        boolean moveFound = true;
        int[] finalSequence = sequence;
        while (moveFound) {
            moveFound = false;
            int low = 0;
            for (int i = 1; i < finalSequence.length - 1; i++) {
                if (finalSequence[low] == 0 && finalSequence[i+1] == 0) {
                    // can play this move
                    finalSequence[i] = -1;
                    moves++;
                    moveFound = true;
                } else  {
                    low++;
                    while (finalSequence[low] == -1)
                        low++;
                }
            }
            if (moveFound) {
                int[] newSequence = new int[finalSequence.length - moves];
                int j = 0;
                for (int i = 0; i < finalSequence.length; i++) {
                    if (finalSequence[i] == -1)
                        continue;
                    newSequence[j++] = finalSequence[i];
                }

                finalSequence = newSequence;
                totalMoves += moves;
                moves = 0;
            }
        }

        if (totalMoves % 2 == 0)
            return BOB;
        return ALICE;
    }
}
