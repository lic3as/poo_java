
package aula14;

public class Aula14 {
    
    public static void main(String[] args) {
        
        Video v[] = new Video[3]; //vetor com 3 vídeos
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2]; //vetor com 2 vídeos
        g[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        g[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5]; //vetor com 5 novas views
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar(9);
        System.out.println(vis[0].toString() + "\n");
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(56.7f);
        System.out.println(vis[1].toString() + "\n");
        vis[2] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[2].toString() + "\n");
        vis[3] = new Visualizacao(g[0], v[0]);
        System.out.println(vis[3].toString() + "\n");
        vis[4] = new Visualizacao(g[0], v[0]);
        System.out.println(vis[4].toString() + "\n");
        
        
        /*System.out.println("VÍDEOS\n------------------------------------------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------------------------------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
    }
    
}
