
package ultraemojicombat;

public class Aula07 {
    
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; //pra facilitar, colocaremos os lutadores em um vetor
        //pretty boy
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        //putscript
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        //snapshadow
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        //dead code
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        //ufocobol
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        //nerdaard
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        /*l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
        l[5].apresentar();
        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        l[4].status();
        l[5].status();*/
        
        Luta UEC01 = new Luta(); //luta UEC01
        UEC01.marcarLuta(l[0], l[1]); //marcar luta com pretty boy e putscript
        UEC01.lutar(); 
    }
    
}
