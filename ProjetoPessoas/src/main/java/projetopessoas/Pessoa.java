
package projetopessoas;

public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1); //idade aumenta 1
    }
    
    public void sobrePessoa(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
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
