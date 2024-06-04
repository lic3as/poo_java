
package livraria;

public class Livraria {
    
    public static void main(String[] args) {
     
        Pessoa[] p = new Pessoa[2]; //vetor com 2 pessoas
        Livro[] l = new Livro[3]; //vetor com 3 livros
        
        p[0] = new Pessoa("Pedro", 44, 'M');
        p[1] = new Pessoa("Ana", 20, 'F');
        
        l[0] = new Livro("Harry Potter e o Prisioneiro de Askaban", "J. K. Rowling", 348, p[1]);
        l[1] = new Livro("O Poder do Hábito", "Charles Duhigg", 408, p[0]);
        l[2] = new Livro("Dom Casmurro", "Machado de Assis", 192, p[1]);
        
        l[0].abrir();
        l[0].folhear(198);
        l[0].detalhes();
        //l[1].detalhes();
        //l[2].detalhes();
    }
    
}
