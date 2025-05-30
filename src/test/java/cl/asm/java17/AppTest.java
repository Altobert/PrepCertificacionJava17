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

    @Test
    public void testClassAnimal(){
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(App.class.getName());        
        Animal animal = new Animal();
        animal.setName("Gato");
        log.info("el nombre del animal es: "+animal.getName());
    }

    @Test
    public void testClassZoo(){
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(App.class.getName());
        log.info("Inicio Test de la clase Zoo.");
        Zoo zoo = new Zoo();
        String [] args = new String[] {"Elefante", "León"};
        zoo.main(args);
        log.info("Test de la clase Zoo completado.");
    }

}
