
package aula14;

public class Visualizacao {
    
    private Gafanhoto espectador;
    private Video filme;
    
    public Visualizacao(Gafanhoto e, Video f){
        this.setEspectador(e);
        this.setFilme(f);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); //o total assistido pelo espectador vai ganhar mais 1
        this.espectador.ganharExp(); //checar se o espectador ganha experiência
        this.filme.setViews(this.filme.getViews() + 1); //o vídeo assistido vai ganhar mais 1 view
    }
    
    public Gafanhoto getEspectador(){
        return this.espectador;
    }
    
    public Video getFilme(){
        return this.filme;
    }
    
    public void setEspectador(Gafanhoto e){
        this.espectador = e;
    }
    
    public void setFilme(Video f){
        this.filme = f;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + this.getEspectador() + ", filme=" + this.getFilme() + '}';
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5); //se não deu nota, vai ser 5
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota); //se deu nota, a avaliação vai ser a nota dada
    }   
    
    public void avaliar(float porc){
        int tot = 0; //nota de acordo com a porcentagem informada
        if(porc <= 20){
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        } else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot); //avaliação recebrá o valor de acordo com a porcentagem
    }
    
}
