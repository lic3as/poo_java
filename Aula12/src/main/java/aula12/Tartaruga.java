
package aula12;

public class Tartaruga extends Reptil {
    
    //polimorfismo do método locomover de Reptil, uma tartaruga se locomove andando
    //sobreposição:
    @Override
    public void locomover(){
        System.out.println("Andando"); //uma tartaruga anda 
    }
    
}
