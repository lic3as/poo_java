
package aula011;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
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
