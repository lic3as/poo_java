
package ultraemojicombat;

public class Lutador {
    
    //atributos:
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //métodos especiais:
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        //construtor recebe todos os atributos e os atribui
        //o único atributo não informado é a categoria porque ela será atribuída automaticamente em outro método
    }
    
    protected String getNome(){
        return this.nome;
    }
    
    protected String getNacionalidade(){
        return this.nacionalidade;
    }
    
    protected int getIdade(){
        return this.idade;
    }
    
    protected float getAltura(){
        return this.altura;
    }
    
    protected float getPeso(){
        return this.peso;
    }
    
    protected String getCategoria(){
        return this.categoria;
    }
    
    protected int getVitorias(){
        return this.vitorias;
    }
    
    protected int getDerrotas(){
        return this.derrotas;
    }
    
    protected int getEmpates(){
        return this.empates;
    }    
    
    protected void setNome(String nome){
        this.nome = nome;
    }
    
    protected void setNacionalidade(String nac){
        this.nacionalidade = nac;
    }
    
    protected void setIdade(int idade){
        this.idade = idade;
    }
    
    protected void setAltura(float alt){
        this.altura = alt;
    }
    
    protected void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }
    
    protected void setCategoria(){
        if(this.getPeso() < 52.2f){
            this.categoria = "inválido";
        } else if(this.getPeso() <= 70.3f){
            this.categoria = "leve";
        } else if(this.getPeso() <= 83.9f){
            this.categoria = "médio";
        } else if(this.getPeso() <= 120.2f){
            this.categoria = "pesado";
        } else this.categoria = "inválido";
    }
    
    protected void setVitorias(int v){
        this.vitorias = v;
    }
    
    protected void setDerrotas(int d){
        this.derrotas = d;
    }
    
    protected void setEmpates(int e){
        this.empates = e;
    }
    
    //métodos personalidados:
    public void apresentar(){
        System.out.println("HORA DA LUTA! Apresentamos o lutador " + this.getNome() + ".");
        System.out.println("Diretamente de " + this.getNacionalidade() + ".");
        System.out.println("Com " + this.getIdade() + " anos, " + this.getAltura() 
                + "m de altura e pesando " + this.getPeso() + "kg.");
        System.out.println("Ele possui " + this.getVitorias() + " vitórias, " 
                + + this.getDerrotas() + " derrotas e " + this.getEmpates() 
                + " empates.");
    }
    
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1); //quando ganha uma luta, aumenta a qtd de vitórias
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1); //quando perde uma luta, aumenta a qtd de derrotas
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1); //quando empata uma luta, aumenta a qtd de empates
    }
    
}
