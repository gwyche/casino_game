import org.junit.Test;
import static org.junit.Assert.*;

public class RulebookTest {
    private Hand hand = new Hand();

    @Test
    public void gameRules() {
        this.hand.setD1(5);
        this.hand.setD2(6);
        assertEquals(1,(Rulebook.gameRules(this.hand, 0)));
    }

    @Test
    public void gameRules2() {
        this.hand.setD1(3);
        this.hand.setD2(4);
        assertEquals(1,(Rulebook.gameRules(this.hand, 0)));
    }

    @Test
    public void gameRules3() {
        this.hand.setD1(1);
        this.hand.setD2(2);
        assertEquals(-1,(Rulebook.gameRules(this.hand, 0)));
    }

    @Test
    public void gameRules4() {
        this.hand.setD1(6);
        this.hand.setD2(6);
        assertEquals(-1,(Rulebook.gameRules(this.hand, 0)));
    }

    @Test
    public void gameRules5() {
        this.hand.setD1(3);
        this.hand.setD2(4);
        assertEquals(-1,(Rulebook.gameRules(this.hand, 1)));
    }

    @Test
    public void gameRules6() {
        this.hand.setD1(2);
        this.hand.setD2(3);
        assertEquals(1,(Rulebook.gameRules(this.hand, 1)));
    }

    @Test
    public void gameRules7() {
        this.hand.setD1(2);
        this.hand.setD2(3);
        assertEquals(0,(Rulebook.gameRules(this.hand, 0)));
    }


}
