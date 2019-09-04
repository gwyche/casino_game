import org.junit.Test;
import static org.junit.Assert.*;


public class DealerTest {
    Player player = new Player();

    @Test
    public void reportLuck1() {
        player.setDice1(3);
        player.setDice2(4);
        assertEquals(1,(Dealer.reportLuck(player)));
    }

    @Test
    public void reportLuck2() {
        player.setDice1(7);
        player.setDice2(4);
        assertEquals(1,(Dealer.reportLuck(player)));
    }

    @Test
    public void reportLuck3() {
        player.setDice1(1);
        player.setDice2(1);
        assertEquals(-1,(Dealer.reportLuck(player)));
    }

    @Test
    public void reportLuck4() {
        player.setDice1(1);
        player.setDice2(2);
        assertEquals(-1,(Dealer.reportLuck(player)));
    }

    @Test
    public void reportLuck5() {
        player.setDice1(6);
        player.setDice2(6);
        assertEquals(-1,(Dealer.reportLuck(player)));
    }

}
