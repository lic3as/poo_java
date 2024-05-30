
package aula04;

public class Aula04 {

    public static void main(String[] args) {
        //Caneta c1 = new Caneta(); //instanciando Caneta c1
        //c1.setModelo("BIC"); //modelo é BIC
        //c1.setPonta(0.5f); //ponta é 0.5 (tem que colocar f no final quando é float)
        //c1.status();
        //se o acesso de um método é privado (como ponta), você só consegue modificá-lo ou acessá-los com os métodos getters e setters, respectivamente
        Caneta c2 = new Caneta("Spiro", 0.2f, "Preta"); //instanciando Caneta c2
        c2.status(); //testando o construtor de c2
        //com o método construtor, é possível criar toda a caneta em uma única linha
    }
    
}
