
package aula14;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo){
        //um novo Video é criado a partir de um titulo, a avaliacao inicia em 1, as views e curtidas em 0 e o reprouzindo em false
        this.setTitulo(titulo);
        this.avaliacao = 0;
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public int getAvaliacao(){
        return this.avaliacao;
    }
    
    public int getViews(){
        return this.views;
    }

    public int getCurtidas(){
        return this.curtidas;
    }
    
    public boolean getReproduzindo(){
        return this.reproduzindo;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public void setAvaliacao(int avaliacao){
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views); //a avaliação será o total antigdo mais a nova dividido pelas views (uma média)
        this.avaliacao = nova;
    }
    
    public void setViews(int v){
        this.views = v;
    }
    
    public void setCurtidas(int c){
        this.curtidas = c;
    }
    
    public void setReproduzindo(boolean r){
        this.reproduzindo = r;
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true); //quando dá play, reproduzindo vai pra true
    }

    @Override
    public void pause() {
        this.setReproduzindo(false); //quando dá pause, reproduzindo vai pra false
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1); //quando dpa like, aumenta 1 nas curtidas
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + this.getTitulo() + ", avaliacao=" + this.getAvaliacao() + ", views=" + this.getViews() + ", curtidas=" + this.getCurtidas() + ", reproduzindo=" + this.getReproduzindo() + '}';
    }
    
}
