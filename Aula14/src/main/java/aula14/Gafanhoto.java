
package aula14;

public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        //Gafanhoto herda o construtor de Pessoa, além de receber o login e iniciar o total assistido com 0
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public int getTotAssistido(){
        return this.totAssistido;
    }
    
    public void setLogin(String l){
        this.login = l;
    }
    
    public void setTotAssistido(int t){
        this.totAssistido = t;
    }
    
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + this.getLogin() + ", totAssistido=" + this.getTotAssistido() + '}';
        //o super.toString() serve pra chamaar o toString de Pessoa
    }

    @Override
    protected void ganharExp() {
        if(this.getTotAssistido() % 5 == 0){
            this.setExperiencia(this.getExperiencia() + 1);
        } //a cada 5 vídeos assistidos, aumenta 1 na experiência
    }
    
}
