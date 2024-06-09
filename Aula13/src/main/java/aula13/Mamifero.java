
package aula13;

public class Mamifero extends Animal {

    protected String corPelo;
    
    public String getCorPelo(){
        return this.corPelo;
    }
    
    public void setCorPelo(String c){
        this.corPelo = c;
    }
    
    //polimorfismo de sobreposição (mesma assinatura, classes diferentes):
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero"); //som geral de um mamífero
    }
    
}
