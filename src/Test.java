import junit.framework.TestCase;

public class Test extends TestCase {

    public void testImpar() {

        int number = 5;
        assertNotNull("Objeto não nulo", Epar.NumeroImparPar(number));
        assertTrue("Número " + number + " é Impar", Epar.NumeroImparPar(number));
    }

    public void testPar() {
        int number = 10;
        assertNotNull("Objeto não nulo", Epar.NumeroImparPar(number));
        assertFalse("Número " + number + " é Par", Epar.NumeroImparPar(number));
    }

}
