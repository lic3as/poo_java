
package aula011;

public class Aula011 {
    
    public static void main(String[] args) {
        
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo('M');
        v1.sobrePessoa();*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Claúdio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo('M');
        a1.pagarMensalidade();
        
        /*Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setCurso("Finanças");
        b1.setIdade(17);
        b1.setSexo('M');
        b1.pagarMensalidade(); //o do bolsista será diferente porque foi sobreposto
        */
        
       /*Professor p1 = new Professor();
       p1.setNome("Raquel");
       p1.setIdade(35);
       p1.setSexo('F');
       p1.setEspecialidade("Matemática");
       p1.setSalario(2700.89f);
       p1.receberAumento(130.10f);*/
       
       Técnico t1 = new Técnico();
       t1.setNome("Gabriel");
       t1.setIdade(18);
       t1.setCurso("Administração");
       t1.setMatricula(8321);
       t1.setSexo('M');
       t1.setRegistroProfissional(3254);
       t1.praticar();
        
    }
    
}
