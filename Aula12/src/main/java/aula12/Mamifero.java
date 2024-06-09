
package aula12;

public class Mamifero extends Animal{
    
    private String corPelo; //herança por diferença
    
    public String getCorPelo(){
        return this.corPelo;
    }
    
    public void setCorPelo(String c){
        this.corPelo = c;
    }

    //fazendo polimorfismos dos métodos implementados em Animal, em cada tipo de animal, os métodos funcionarão de forma diferente 
    //sobreposição:
    @Override
    public void locomover() {
        System.out.println("Correndo"); //um mamífero se locomove correndo
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando"); //um mamífero se alimenta mamando
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero"); //um mamífero emite som de mamífero
    }
    
}
