package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=5;double b=9;

        double res= calcul.somme(a,b);
        double expected=14;
        Assert.assertTrue(res==expected);
    }
}
