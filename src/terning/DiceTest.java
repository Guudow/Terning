package terning;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Test
    public void roll() {
        Dice testDice = new Dice();
        boolean x = false;
        int rollint = testDice.roll();

        if (rollint >= 1 && rollint <=6)
        {
            x = true;
        }

        assertEquals(true, x);
    }

    @org.junit.Test
    public void rollMultiple() {
        Dice testDice = new Dice();
        int antalRolls = 60000;

    }
}