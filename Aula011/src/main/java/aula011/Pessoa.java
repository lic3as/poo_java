
package aula011;

public abstract class Pessoa {
    //essa é uma classe abstrata, ela não pode ser instanciada, apenas deve servir como mãe de outras classes
    private String nome;
    private int idade;
    private char sexo;
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1); //quando faz aniversário, a idade aumenta 1
    }
    
    public void sobrePessoa(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println(this.getIdade() + " anos, sexo " + this.getSexo());
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
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public void setSexo(char s){
        this.sexo = s;
    }
    
}
