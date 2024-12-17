package groupeisi;

import com.groupeisi.Factoriel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorielTest {
    @Test
    public void testFactorielCase1() {
        //G
        Factoriel fact = new Factoriel();

        //W
        int result = 1;
        int n = 0;

        //T
        assertEquals(result , fact.factoriel(n));

    }

    @Test
    public void testFactorielCase2() {
        //G
        Factoriel fact = new Factoriel();

        //W
        int result = 24;
        int n = 4;

        //T
        assertEquals(result, fact.factoriel(n));

    }

}
