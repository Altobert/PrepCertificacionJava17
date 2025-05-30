package cl.asm.java17;

public class Zoo {
    public static void main(String[] args) {
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(Zoo.class.getName());
        log.info("Bienvenido al Zoo!");
        
        System.out.println(args[0]);
        System.out.println(args[1]);
        
        // Puedes agregar más lógica aquí para manejar otros animales o interacciones
    }
}
