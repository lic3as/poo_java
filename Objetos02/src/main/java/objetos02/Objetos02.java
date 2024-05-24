//criar classes e instanciar um objeto físico e um objeto conceitual
package objetos02;

public class Objetos02 {
    
    
    public static void main(String[] args) {
        //objeto físico Celular:
        Celular a14 = new Celular(); //instanciando a14
        a14.modelo = "A14 5G";
        a14.cor = "prata";
        a14.bateria = 64;
        a14.ligado = false;
        a14.internet = true;
        a14.status();
        a14.atenderLigacao();
        a14.ligar();
        a14.status();
        
        //objeto conceitual Filme:
        Filme branquelas = new Filme(); //instanciando branquelas
        branquelas.nome = "As Branquelas";
        branquelas.duracao = 204;
        branquelas.pausa = true;
        branquelas.genero = "Comédia";
        branquelas.ano = 2004;
        branquelas.status();
        branquelas.addLista();
        branquelas.play();
        branquelas.status();
        
    }
 
}
