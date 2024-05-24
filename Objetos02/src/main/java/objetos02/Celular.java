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
public class Celular {
    //atributos:
    String modelo;
    String cor;
    int bateria;
    boolean ligado;
    boolean internet;
    
    //métodos:
    void ligar(){
        this.ligado = true; //se ligar, o celular fica ligado
    }
    
    void desligar(){
        this.ligado = false; //se desligar, o celular não fica ligado
    }
    
    void abrirWhatsApp(){
        if(this.internet == true) System.out.println("Abrindo WhatsApp"); //se tem internet, pode usar o WhatsApp
        else System.out.println("ERRO! Sem acesso à internet"); //se não tem internet, dá erro
    }
    
    void tirarFoto(){
        System.out.println("Tirando foto, sorria");
    }
    
    void atenderLigacao(){
        if(this.ligado == true) System.out.println("Alô"); //se estiver ligado, pode atender
        else System.out.println("Chamada perdida"); //se estiver desligado, a chamada é perdida
    }
    
    void encerrarLigacao(){
        System.out.println("Tchau");
    }
    
    //visualizar estados:
    void status(){
        System.out.println("CELULAR");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Bateria: " + this.bateria);
        if(this.ligado == true) System.out.println("Aparelho ligado"); //se ligado é verdadeiro, o aparelho está ligado
        else System.out.println("Aparelho desligado");
        if(this.internet == true) System.out.println("Acesso à internet"); //se internet é verdadeiro, o aparelho tem acesso à internet
        else System.out.println("Sem acesso à internet");
    }
    
}
