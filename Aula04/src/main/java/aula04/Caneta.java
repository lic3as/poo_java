
package aula04;

public class Caneta {
    //atributos:
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //método contrutor (ele sempre possui o mesmo nome da classe, é público e não possui retorno - não coloca nem o void):
    public Caneta(String m, float p, String c){
        //o método construtor cria o objeto com os atributos e métodos padrões (eles podem ser alterados depois)
        //nesse caso, os atribbutos serão informados e colocados automaticamente quando a caneta for criada
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar(); //a caneta sempre iniciará tampada
    }
    
    //métodos getters e setters (sempre são públicos):
    public String getModelo(){ //o tipo de retorno de modelo é String
        return this.modelo; //o método get é acessor, ou seja, serve para acessar o conteúdo de modelo
    }
    
    public void setModelo(String m){ //como não vai haver um retorno, set é um método void mas há um parâmetro String como entrada
        this.modelo = m; //o método set é modificador, ou  seja, serve para modificar o valor de moselo
    }
    
    public float getPonta(){ //o retorno do getPonta é float
        return this.ponta;
    }
    
    public void setPonta(float p){ //o parâmetro de ponta é float
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    //clicando ctrl + i,  posso criar os métodos contrutor getters e setters automaticamente
    
    //visualizar os estados:
    public void status(){
        System.out.println("SOBRE A CANETA:");
        //agora é possível acessar informações dos atributos com os métodos getters:
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        if(this.getTampada() == true) System.out.println("Está tampada");
        else System.out.println("Está destamapada");
       
    }
    
    //outros métodos:
    public void tampar(){
        this.setTampada(true); //quando tampa a caneta, ela fica tamapda
    }
    
    public void destampar(){
        this.setTampada(false); //quando destampa a caneta, ela não fica tampada
    }
}
