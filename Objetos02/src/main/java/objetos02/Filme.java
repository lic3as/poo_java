/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos02;

/**
 *
 * @author alice
 */
public class Filme {
    //atributos:
    String nome;
    int duracao;
    boolean pausa;
    String genero;
    int ano;
    
    //métodos:
    void pause(){
        this.pausa = true; //se der pause, está pausado
    }
    
    void play(){
        this.pausa = false; //se der play, não está pausado
    }
    
    void addLista(){
        System.out.println("Adicionado à sua lista");
    }
    
    void verInfo(){
        System.out.println("Carregando informações");
    }
    
    void voltar10s(){
        System.out.println("Voltando 10s");
    }
    
    //visualizar estados:
    void status(){
        System.out.println("FILME");
        System.out.println("Nome: " + this.nome);
        System.out.println("Duração: " + this.duracao);
        if(this.pausa == true) System.out.println("O filme está pausado"); //se pause for verdadeiro, o filme está pausado
        else System.out.println("O filme está passando");
        System.out.println("Gênero: " + this.genero);
        System.out.println("Ano: " + this.ano);
    }
}
