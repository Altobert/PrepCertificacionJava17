package cl.asm.java17;

// El nombre publico de la clase tiene que hacer match con el nombre del archivo
// por lo que si la clase se llama Animal, el archivo debe llamarse Animal.java
public class Animal {

    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

//Es posible tener una clase dentro de otra clase, 
//pero no es una buena práctica. EL nombre de la clase interna
//debe ser diferente al de la clase externa.
//El nombre del archivo.java debe ser el mismo que la clase public.
//
class Animal2{

}