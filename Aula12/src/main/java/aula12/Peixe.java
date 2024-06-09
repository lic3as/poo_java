
package aula12;

public class Peixe extends Animal {
    
    private String corEscama; //herança por diferença
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String c){
        this.corEscama = c;
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha"); //um peixe pode soltar bolhas, diferente dos outos animais
    }

    //fazendo polimorfismos dos métodos implementados em Animal, ou seja, para cada tipo de animal, os métodos funcionarão de formas diferentes
    //sobreposição:
    @Override
    public void locomover() {
        System.out.println("Nadando"); //um peixe se locomove nadando
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias"); //um peixe se alimenta de substâncias
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som"); //um peixe não emite som
    }
    
}
