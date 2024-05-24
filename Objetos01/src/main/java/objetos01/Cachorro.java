/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos01;

/**
 *
 * @author alice
 */
public class Cachorro {
    //atributos:
    String raca;
    int idade;
    String cor;
    String tamanho;
    int peso;
    
    //métodos:
    void latir(){
        System.out.println("AU AU");
    }
    
    void dormir(){
        System.out.println("ZZZ...");
    }
    
    void passear(){
        System.out.println("Estou passando");
    }
    
    void comer(){
        System.out.println("Estou comendo");
    }
    
    void lamber(){
        System.out.println("Estou te lambendo");
    }
    
    //visualizar estados:
    void status(){
        System.out.println("Eu sou um cachorro");
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Peso: " + this.peso);
    }
}
