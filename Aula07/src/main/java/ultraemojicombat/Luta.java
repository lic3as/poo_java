
package ultraemojicombat;

import java.util.Random;

public class Luta {
   
    //atributos:
    private Lutador desafiado; //aqui relacionamos a classe Lutador com a classe Luta através do atributo desafiado
    private Lutador desafiante;// aqui relacionamos a classe Lutador com a classe Luta através do atributo desafiante
    private int rounds; //qtd de ronds da luta
    private boolean aprovada; //se a lluta foi aprovada ou não
    
    //métodos especiais:
    private Lutador getDesafiado(){
        return this.desafiado;
    }
    
    private Lutador getDesafiante(){
        return this.desafiante;
    }
    
    private int getRounds(){
        return this.rounds;
    }
    
    private boolean getAprovada(){
        return this.aprovada;
    }
    
    private void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    
    private void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    
    private void setRounds(int ro){
        this.rounds = ro;
    }
    
    private void setAprovada(boolean ap){
        this.aprovada = ap;
    }
    
    //métodos personalizados:
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){ //se as categorias dos lutadores forem iguais e os lutadores forem diferentes, a luta pode acontecer
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            //o desafiado será o primeiro adicionado ao marcarluta e o desafiante será o segundo
        } else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            //se não cumprir uma das regras, a luta não é aprovada e os lutadores são definidos como nulos
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("------------------------------------------------------------------------");
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random random = new Random(); //usar o random pra decidir o resultado da luta
            int vencedor = random.nextInt(3); //gerar número entre 0 e 2
            switch(vencedor){
                case 0: //empate
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("A luta está acontecendo...");
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta(); //adcionar o empate ao desafiado
                    this.getDesafiante().empatarLuta(); //adicionar o empate ao desafiante
                    break;
                case 1: //desafiado ganhou
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("A luta está acontecendo...");
                    System.out.println(this.getDesafiado().getNome() + " é o campeão desta luta!");
                    this.getDesafiado().ganharLuta(); //adicionar viória ao desafiado
                    this.getDesafiante().perderLuta(); //adicionar a derrota ao desafiante
                    break;
                case 2: //desafiante ganhou
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("A luta está acontecendo...");
                    System.out.println(this.getDesafiante().getNome() + " é o campeão desta luta!");
                    this.getDesafiado().perderLuta(); //adionar a vitória ao desafiado
                    this.getDesafiante().ganharLuta(); //adicionar a derrota ao desafiante
                    break;
            }   
        } else{
            System.out.println("A luta não pode acontecer.");
        }
    }
}
