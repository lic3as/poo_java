
package projetopessoas;

public class Aluno extends Pessoa {
    //o extends serve para usar o conceito de herança, ou seja, agora Aluno herda características de Pessoa
    private int matricula;
    private String curso;
    
    public void cancelarMatr(){
        System.out.println("A mátricula de " + this.getNome() + " será cancelada.");
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void setMatricula(int m){
        this.matricula = m;
    }
    
    public void setCurso(String c){
        this.curso = c;
    }
}
