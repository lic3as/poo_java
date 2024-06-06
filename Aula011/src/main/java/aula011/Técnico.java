
package aula011;

public class Técnico extends Aluno {
    
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("O aluno técnico em " + this.getCurso() + ", " + this.getNome() + ", está praticando." );
    }
    
    public int getRegistroProfissional(){
        return this.registroProfissional;
    }
    
    public void setRegistroProfissional(int r){
        this.registroProfissional = r;
    }
    
}
