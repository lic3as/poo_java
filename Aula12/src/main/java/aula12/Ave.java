
package aula12;

public class Ave extends Animal {
    
    private String corPena; //herança por diferença
    
    public String getCorPena(){
        return this.corPena;
    }
    
    public void setCorPena(String c){
        this.corPena = c;
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho"); //uma vae pode fazer um ninho, diferente dos outros animais
    }

    //fazendo polimorfismos dos méotodos implementados em Animal, ou seja, para cada animal, os métodos irão funcionar de uma forma diferente
    //soreposição:
    @Override
    public void locomover() {
        System.out.println("Voando"); //uma ave se locomove voando
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas"); //uma ave se alimenta de frutas
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave"); //uma ave emite som de ave
    }
    
}
