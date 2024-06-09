
package aula13;

public class Lobo extends Mamifero {
    
    //polimorfismo de sobreposição (mesma assinatura, classes diferentes):
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuu!"); //som específico do lobo
    }
    
}
