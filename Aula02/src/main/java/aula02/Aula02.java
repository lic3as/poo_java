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
public class Aula02 {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta(); //intanciando (criando) o objeto Caneta c1
        //agora poderão ser colocados atributos e realizados os métodos de Caneta em c1
        //atributo não tem parêntese depois, método tem parêntese depois
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar(); //agora está tampada
        c1.status();
        c1.rabiscar(); //não vai poder rabiscar porque tá tampada
        c1.destampar(); //agora está destampada
        c1.status();
        c1.rabiscar(); //aqui ela já vai poder rabiscar
        
        Caneta c2 = new Caneta(); //intanciando o objeto Caneta c2
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
