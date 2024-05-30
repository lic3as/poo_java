
package aula05;

public class ContaBanco {
    
    //ATRIBUTOS:
    public int numConta;
    protected String tipo; //cc pra corrente, cp pra poupança
    private String dono;
    private float saldo;
    private boolean status; //true = aberta, false = fechada
    
    //MÉTODOS PERSONALIZADOS:
    public void abrirConta(int numConta, String tipo, String dono){ //informar dados da conta pra abertura
        this.setnumConta(numConta); //número da conta aberta
        this.setTipo(tipo); //tipo da conta aberta
        this.setDono(dono); //nome do dono da conta aberta
        if("cc".equals(this.getTipo())){
            this.setSaldo(50); //se a conta for corrente, inicia com 50 de saldo
            this.setStatus(true); //atualizar status para aberta
            System.out.println("Conta aberta! Saldo = R$" + this.getSaldo());
        } else if("cp".equals(this.getTipo())){
            this.setSaldo(150); //se a conta for poupança, inicia com 150 de saldo
            this.setStatus(true); //atualizar status para aberta
            System.out.println("Conta aberta! Saldo = R$ " + this.getSaldo());
        } else System.out.println("ERRO! Tipo de conta não reconhecido."); //se não for nenhuma das opções, dá erro     
    }
    
    public void fecharConta(){
        if(this.getSaldo() < 0){
            System.out.println("ERRO! Ainda há dívidas pendentes."); //se o saldo for negativo, o dono está devendo e por isso não pode fechar a conta
        } else if(this.getSaldo() > 0){
            System.out.println("ERRO! Você ainda possui R$" + this.getSaldo() + " de saldo. Realize o saque antes de fechar a conta."); //se houver dinheiro na conta, ele deve ser sacado antes de fechá-la
        } else{
            this.setStatus(false); //se a conta não tiver mais saldo e nem dívidas, atualizar status para fechada
            System.out.println("Conta fechada!");
        }
    }
    
    public void depositar(float deposito){
        if(this.getStatus() == true){ //conferir se a conta está aberta
            this.setSaldo(this.getSaldo() + deposito); //somar o valor do deposito ao saldo atual
            System.out.println("Depósito concluído! Saldo = R$ " + this.getSaldo());
        } else{
            System.out.println("ERRO! A conta está fechada.");
        }
    }
    
    public void sacar(float saque){
        if(this.getStatus() == true){ //conferir se a conta está aberta
            if(this.getSaldo() < saque){ //conferir se o saldo é suficiente pro saque
                System.out.println("ERRO! Saldo insuficiente.");
            } else{
                this.setSaldo(this.getSaldo() - saque); //subtrair o saque do valor do saldo atual
                System.out.println("Saque concluído! Saldo = R$ " + this.getSaldo());
            }
        } else{
            System.out.println("ERRO! A conta está fechada.");
        }
    }
    
    public void pagarMensal(){ //pagar mensalidade
        if(this.getStatus() == true){ //verificar se a conta está aberta
            if("cc".equals(this.getTipo())){
                this.sacar(12); //se for conta corrente, a mensalidade é de 12 reais
                System.out.println("Mensalidade paga.");
            } else if("cp".equals(this.getTipo())){
                this.sacar(20); //se for conta poupança, a mensalidade é de 20 reais
                System.out.println("Mensalidade paga.");
            } else{
                System.out.println("ERRO! Tipo de conta não reconhecido.");
            } 
        } else{
            System.out.println("ERRO! A conta está fechada.");
        }
    }
    
    protected void contaStatus(){ //ver os estados de todos os atributos da conta
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    //MÉTODOS ESPECIAIS:
    void ContaBanco(){
        // a conta inicia fechada e com saldo zerado
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    public int getnumConta(){
        return this.numConta;
    }
    
    public void setnumConta(int num){
        this.numConta = num;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
}
