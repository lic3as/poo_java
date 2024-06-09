
package aula12;

public class Cachorro extends Mamifero {
    
    //polimorfismo do méotodo emitirSom de Mamifero, o cachorro emite o som "au au"
    //sobreposição:
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!"); //um cachorro late
    }
    
    //herança por diferença, um Cachorro possui métodos diferentes de Mamífero
    
}
