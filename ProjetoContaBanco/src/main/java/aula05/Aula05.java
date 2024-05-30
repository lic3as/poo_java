
package aula05;

public class Aula05 {
    
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(); //instanciando conta1
        conta1.abrirConta(123, "cp", "Maria José");
        conta1.contaStatus();
        conta1.fecharConta();
        conta1.depositar(30.25f);
        conta1.pagarMensal();
    }
    
}
