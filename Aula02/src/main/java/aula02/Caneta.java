/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author alice
 */
public class Caneta { //classe Caneta (deve começar com letra maiúscula)
    //atributos (características):
    String modelo; //modelo da caneta
    String cor; //cor da caneta
    float ponta; //tamanho da ponta da caneta
    int carga; //carga de tinta da caneta
    boolean tampada; //se está tampada ou não
    
    //métodos (ações que poderão ser realizadas):
    void status(){ //mostrar os estados de determinada caneta
        System.out.println("Caneta criada");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        if(this.tampada == true){
            System.out.println("Está tampada");
        } else{
            System.out.println("Está destampada");
        }
        //this é uma referência ao próprio objeto que chamou, no lugar dele será colocado o nome do objeto chamado quando for executar
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar."); //se a caneta estiver tampada, ela não pode rabiscar
        } else{
            System.out.println("Estou rabiscando..."); //se ela está destampada, ela pode rabiscar
        } 
    }
    
    void tampar(){
        this.tampada = true; //para tampar, o tampada recebe true
    }
    
    void destampar(){
        this.tampada = false; //para tampar, o tampada recebe false
    }
    
}
