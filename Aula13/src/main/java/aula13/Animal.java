
package aula13;

public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void emitirSom();
    
    public float getPeso(){
        return this.peso;
    }
    
    public int getIdaade(){
        return this.idade;
    }
    
    public int getMemebros(){
        return this.membros;
    }
    
    public void setPeso(float p){
        this.peso = p;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public void setMembros(int m){
        this.membros = m;
    }
    
}
