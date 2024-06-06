
package projetopessoas;

public class Professor extends Pessoa {
    //o extends serve para usar o conceito de herança, ou seja, Professor herda características de Pessoa
    private String especialidade;
    private float salario;
    
    public void ReceberAum(float aumento){
        this.setSalario(this.getSalario() + aumento); //salario = salario + aumento
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    
    public void setSalario(float s){
        this.salario = s;
    }
    
}
