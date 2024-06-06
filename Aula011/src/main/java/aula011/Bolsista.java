
package aula011;

public class Bolsista extends Aluno {
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.getNome());
    }
    
    //pra modificar um método existente em uma classe mãe, basta colocar o @Override (sobrepor) antes do método e realizar as modificações
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado.");
    }
    
    public float getBolsa(){
        return this.bolsa;
    }
    
    public void setBolsa(float b){
        this.bolsa = b;
    }
    
}
