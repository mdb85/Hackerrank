import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 12/04/17.
 */
public final class ZeroOneGameTest {

    @Test
    public void test_1(){
        ZeroOneGame game = new ZeroOneGame(new int[]{1, 0, 0, 1});
        String winner = game.computeWinner();
        assertEquals(ZeroOneGame.BOB, winner);
    }

    @Test
    public void test_2(){
        ZeroOneGame game = new ZeroOneGame(new int[]{1, 0, 1, 0, 1});
        String winner = game.computeWinner();
        assertEquals(ZeroOneGame.ALICE, winner);
    }

    @Test
    public void test_3(){
        ZeroOneGame game = new ZeroOneGame(new int[]{0, 0, 0, 0, 0, 0});
        String winner = game.computeWinner();
        assertEquals(ZeroOneGame.BOB, winner);
    }

    @Test
    public void test_4(){
        ZeroOneGame game = new ZeroOneGame(new int[]{0, 1, 0, 1, 0, 1});
        String winner = game.computeWinner();
        assertEquals(ZeroOneGame.ALICE, winner);
    }
}