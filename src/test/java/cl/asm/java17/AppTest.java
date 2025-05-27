package cl.asm.java17;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        App testInstance = new App();
        String [] saludos = new String[] {"get", "are", "here!"};
        testInstance.main(saludos);        
        assertTrue(true);
    }
}
