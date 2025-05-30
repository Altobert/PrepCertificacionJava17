package cl.asm.java17;

public class Zoo {
    public static void main(String[] args) {
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(Zoo.class.getName());                
        for(int i=0; i<args.length; i++) {
           log.info(args[i]);             
        }
        
    }
}
