
package livraria;

public class Livro implements Publicacao {
    
    //atributos:
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //métodos especiais:
    public Livro(String ti, String au, int to, Pessoa le){
        this.setTitulo(ti);
        this.setAutor(au);
        this.setTotPaginas(to);
        this.setPagAtual(0); //o livro inicia em 0
        this.setAberto(false); //o livro inicia fechado
        this.setLeitor(le);
    }
    
    protected String getTitulo(){
        return this.titulo;
    }
    
    protected String getAutor(){
        return this.autor;
    }
    
    protected int getTotPaginas(){
        return this.totPaginas;
    }
    
    protected int getPagAtual(){
        return this.pagAtual;
    }
    
    protected boolean getAberto(){
        return this.aberto;
    }
    
    protected Pessoa getLeitor(){
        return this.leitor;
    }
    
    protected void setTitulo(String t){
        this.titulo = t;
    }
    
    protected void setAutor(String a){
        this.autor = a;
    }
    
    protected void setTotPaginas(int t){
        this.totPaginas = t;
    }
    
    protected void setPagAtual(int p){
        this.pagAtual = p;
    }
    
    protected void setAberto(boolean a){
        this.aberto = a;
    }
    
    protected void setLeitor(Pessoa l){
        this.leitor = l;
    }
    
    //métodos personalizados:
    public void detalhes(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Aberto: " + this.getAberto());
        System.out.println("Leitor: " + this.getLeitor().getNome() + ", " + this.getLeitor().getIdade() + " anos, sexo " + this.getLeitor().getSexo());
    }
    
    @Override
    public void abrir() {
        this.setAberto(true); //livro aberto
    }

    @Override
    public void fechar() {
        this.setAberto(false); //livro fechado
    }

    @Override
    public void folhear(int p) {
        if(this.getTotPaginas() > p){ //se a página escolhida for menor que o total de páginas
            this.setPagAtual(p); //folhear até a página escolhida
        } else{
            System.out.println("Limite de páginas atingido.");
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1); //avançar 1 página
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() + 1); //voltar 1 página
    }
    
}
