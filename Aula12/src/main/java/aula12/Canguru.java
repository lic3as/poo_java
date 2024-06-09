
package aula12;

public class Canguru extends Mamifero {
 
    //polimorfimo do méotodo locomover de Mamifero, no lugar de correr, o Canguru salta
    //sobreposição:
    @Override
    public void locomover(){
        System.out.println("Saltando"); //um canguru se locomove saltando
    }
    
    public void usarBolsa(){
        System.out.println("Usando bolsa"); //um canguru pode usar sua bolsa
    }
 
    //herança por diferença (existem métodos diferentes de Mamifero em Canguru
    
}
