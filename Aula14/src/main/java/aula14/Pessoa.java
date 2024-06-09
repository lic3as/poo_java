
package aula14;

public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;
    
    public Pessoa(String nome, int idade, char sexo){
        //uma Pessoa é criada a partir do nome, idade e sexo, a experiencia inicia em 0
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(0);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public int getExperiencia(){
        return this.experiencia;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public void setSexo(char s){
        this.sexo = s;
    }
    
    public void setExperiencia(int e){
        this.experiencia = e;
    }
    
    protected abstract void ganharExp();
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", experiencia=" + this.getExperiencia() + '}';
    }
    
}
