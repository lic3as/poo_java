
package aula12;

public abstract class Animal {
    
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirSom();
    
    public float getPeso(){
        return this.peso;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public int getMembros(){
        return this.membros;
    }
    
    public void setPeso(float p){
        this.peso = p;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public void setMemebros(int m){
        this.membros = m;
    }
    
}
