package cl.asm.java17;
/**
 * Hello world!
 */
public class App {
    
    public static void main(String[] args) {
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(App.class.getName());        
        for (String string : args) {
            log.info("Argument: " + string);            
        }
    }
}
