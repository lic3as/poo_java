
package projetopessoas;

public class Funcionario extends Pessoa {
    //o extends serve para usar o conceito de herança, ou seja, Funcionario herda características de Pessoa
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        if(this.getTrabalhando()){
            this.setTrabalhando(false); //se estiver trabalhando, para de trabalhar
        } else{
            this.setTrabalhando(true); //se não estiver trabalhando, começa a trabalhar
        }
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public boolean getTrabalhando(){
        return this.trabalhando;
    }
    
    public void setSetor(String s){
        this.setor = s;
    }
    
    public void setTrabalhando(boolean t){
        this.trabalhando = t;
    }
    
}
