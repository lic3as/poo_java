
package aula12;

public class Reptil extends Animal {
    
    private String corEscama; //herança por diferença
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String c){
        this.corEscama = c;
    }

    //fazendo poliformismos dos métodos implementados em Animal, para cada tipo de animal, os métodos funcionam de forma diferente
    //sobreposição:
    @Override
    public void locomover() {
        System.out.println("Rastejando"); //um réptil se locomove rastejando
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais"); //um réptil se alimenta de vegetais
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil"); //um rétil emite som de réptil 
    }
    
    
}
