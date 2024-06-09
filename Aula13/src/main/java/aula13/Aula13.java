
package aula13;

public class Aula13 {
    
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
     
        /*m.emitirSom();
        l.emitirSom();
        c.emitirSom();*/
        
        c.reagir("Bora passear"); //frase agradável
        c.reagir("Sai daqui"); //frase rude
        c.reagir(11, 45); //horário = 11:45
        c.reagir(21,00); //horário = 21:00
        c.reagir(true); //dono
        c.reagir(false); //não é o dono
        c.reagir(2, 12.5f); //cachorro novo e pesado
        c.reagir(17, 4.5f); //cachorro velho e leve
        
    }
    
}
