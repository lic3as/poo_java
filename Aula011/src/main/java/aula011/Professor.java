
package aula011;

public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumento){
        System.out.println("Salário atual: " + this.getSalario());
        this.setSalario(this.getSalario() + aumento); //salario = salario + aumento
        System.out.println("Salário com aumento: " + this.getSalario());
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
