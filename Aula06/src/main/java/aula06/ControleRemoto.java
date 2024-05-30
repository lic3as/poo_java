
package aula06;

public class ControleRemoto implements Controlador { //implementar a interface Controlador (as funçoes abstratas deverão ser implementadas propriamente aqui)
    
    //atributos:
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //no encapsulamento, colocamos todos os atributos como privados (ou pelo menos como protegidos)
    
    //métodos especiais:
    public ControleRemoto(){
        //sempre que um novo controle é criado, ele inicia ligado, sem tocar e com volume de 50
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }

    //métodos abstratos:
    @Override
    public void ligar() {
        this.setLigado(true); //pra ligar, atualiza o ligado pra true
    }

    @Override
    public void desligar() {
        this.setLigado(false); //pra desligar, atualiza o ligado pra false (desligado)
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){ //se estiver ligado, mostra o menu
            System.out.println("MENU -----------------------");
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.print("Volume: ");
            for(int  i = 0; i < this.getVolume(); i += 5){ //a cada 5 de volume, adiciona um | (5 ligados)
                System.out.print("|");
            } for(int  i = 100; i > this.getVolume(); i -= 5){ //depois da qtd de volume, a cada 5, adiciona um - (5 desligados)
                System.out.print("-");
            } System.out.println("");
        } else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
            System.out.println("Fechando menu...");
        } else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){ 
            if(this.getVolume() < 100){ //o máximo de volume é 100
                this.setVolume(this.getVolume() + 5); //se estiver ligado, aumenta o volume em 5
                //imprimir o total de volume
                System.out.print("Volume: ");
                for(int  i = 0; i < this.getVolume(); i += 5){ //a cada 5 de volume, adiciona um | (5 ligados)
                    System.out.print("|");
                } for(int  i = 100; i > this.getVolume(); i -= 5){ //depois da qtd de volume, a cada 5, adiciona um - (5 desligados)
                    System.out.print("-");
                } System.out.println("");
            } else{
                System.out.println("Volume máximo atingido.");
            }
        } else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            if(this.getVolume() > 0){ //o mínimo de volume é 0
                this.setVolume(this.getVolume() - 5); //se estiver ligado, diminui o volume em 5
                //imprimir o total de volume
                System.out.print("Volume: ");
                for(int  i = 0; i < this.getVolume(); i += 5){ //a cada 5 de volume, adiciona um | (5 ligados)
                    System.out.print("|");
                } for(int  i = 100; i > this.getVolume(); i -= 5){ //depois da qtd de volume, a cada 5, adiciona um - (5 desligados)
                    System.out.print("-");
                } System.out.println("");
            } else{
                System.out.println("Volume mínimo atinngido.");
            }
        } else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if((this.getLigado()) && (this.getVolume() > 0)){
            this.setVolume(0); //se estiver ligado e tiver volume, muda o volume pra 0
        } else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if((this.getLigado()) && (this.getVolume() == 0)){
            this.setVolume(50); //se estiver ligado e mudo, muda o volume pra 50
        } else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void play() {
        if((this.getLigado()) && (!this.getTocando())){
            this.setTocando(true); //se estiver ligado e não estiver tocando, muda pra tocando
        } else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void pause() {
        if((this.getLigado()) && (this.getTocando())){
            this.setTocando(false); //se estiver ligado e tocando, muda pra não tocando
        } else{
            System.out.println("Aparelho desligado.");
        }
    }
    
}
