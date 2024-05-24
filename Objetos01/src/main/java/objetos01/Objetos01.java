//criar classes e instanciar um objeto físico e um objeto conceitual

package objetos01;

public class Objetos01 {
    
    public static void main(String[] args) {
        
        //objeto físico Cachorro:
        Cachorro Bob = new Cachorro(); //instanciando Bob
        Bob.raca = "Shih Tzu";
        Bob.idade = 3;
        Bob.cor = "preto e branco";
        Bob.tamanho = "pequeno";
        Bob.peso = 4;
        Bob.status();
        Bob.latir();
        
        //objeto conceitual Aula:
        Aula aula1 = new Aula(); //instanciando aula1
        aula1.duracao = 90;
        aula1.professor = "Marquinhos";
        aula1.disciplina = "Geografia";
        aula1.atividade = true;
        aula1.presenca = false;
        aula1.status();
        aula1.responderChamada();
        aula1.fazerAtividade();
        aula1.status();
    }
    
}
