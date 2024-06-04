
package livraria;

public class Pessoa {

    //atributos:
    private String nome;
    private int idade;
    private char sexo;
    
    //métodos especiais:
    public Pessoa(String n, int i, char s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
    }
    
    protected String getNome(){
        return this.nome;
    }
    
    protected int getIdade(){
        return this.idade;
    }

    protected char getSexo(){
        return this.sexo;
    }
    
    protected void setNome(String n){
        this.nome = n;
    }
    
    protected void setIdade(int i){
        this.idade = i;
    }
    
    protected void setSexo(char s){
        this.sexo = s;
    }
    
    //métodos personalizados:
    public void fazerAniver(){
        //quando faz aniversário, aumenta 1 na idade
        this.setIdade(this.getIdade() + 1);
    }
    
}
