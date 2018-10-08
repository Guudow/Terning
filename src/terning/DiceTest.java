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
        int en = 0, to = 0, tre = 0, fire = 0, fem = 0, seks = 0;

        for (int i = 0; i < antalRolls; i++)
        {
            int resultat = testDice.roll();

            switch (resultat)
            {
                case 1:
                    en++;
                    break;
                case 2:
                    to++;
                    break;
                case 3:
                    tre++;
                    break;
                case 4:
                    fire++;
                    break;
                case 5:
                    fem++;
                    break;
                case 6:
                    seks++;
                    break;
            }
        }

        assertTrue("Der er for få 1'ere " + en, en > 9600);
        assertTrue("Der er for mange 1'ere " + en, en < 10400);

        assertTrue("Der er for få 2'ere " + to, to > 9600);
        assertTrue("Der er for mange 2'ere " + to, to < 10400);

        assertTrue("Der er for få 3'ere " + tre, tre > 9600);
        assertTrue("Der er for mange 3'ere " + tre, tre < 10400);

        assertTrue("Der er for få 4'ere " + fire, fire > 9600);
        assertTrue("Der er for mange 4'ere " + fire, fire < 10400);

        assertTrue("Der er for få 5'ere " + fem, fem > 9600);
        assertTrue("Der er for mange 5'ere " + fem, fem < 10400);

        assertTrue("Der er for få 6'ere " + seks, seks > 9600);
        assertTrue("Der er for mange 6'ere " + seks, seks < 10400);

    }
}