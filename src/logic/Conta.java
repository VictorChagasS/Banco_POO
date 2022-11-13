package logic;

import java.util.ArrayList;

public abstract class Conta implements Ted, Pix{
    
    private double saldo = 1000;
    private String chavePix;
    private String senha;
    private String email;
    private String numeroConta;
    private Cartao cartao;
    private ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
    private String nome;
    

    public Conta(String nome, String senha, String email) {
        this.nome = nome;
        this.chavePix = email;
        this.numeroConta = RandomNumeroConta.gerarNumeroConta();
        this.email = email;
        this.senha = senha;
        cartao = new Cartao();
        cartao.setNumeroCartao(RandomNumeroConta.gerarNumeroCartao());
    }

    public Cartao getCartao() {
        return cartao;
    }
  
    public void addTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
 
    public boolean verificar(String email, String senha)
    {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public String getSenha() {
        return senha;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Integer getDataNasc(){
        return null;
    }

    @Override
    public void cadastrarChave(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String mostrarChave() {
        return chavePix;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

   
    protected void criarTransacao( Double valor, String tipoTransacao, Boolean envioRecebe, Conta destinario) {
        Transacao transacao = new Transacao(destinario,valor,tipoTransacao,envioRecebe);
        this.addTransacao(transacao);
    } 
   
    protected void criarTransacao( Double valor, String tipoTransacao, Boolean envioRecebe) {
        Transacao transacao = new Transacao(valor,tipoTransacao,envioRecebe);
        this.addTransacao(transacao);
    } 

    
    @Override
    public void transferenciaTed(Conta contaDestino, double valor) throws Exception{
        checarOperacao(valor);
        checarOperacaoTransferencia(contaDestino, valor);

        this.setSaldo(this.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        criarTransacao(valor,"TED",true,contaDestino);
        contaDestino.criarTransacao(valor,"TED",false,this);
        
    }

    @Override
    public void pagarComPix(double valor, Conta contaDestino, Banco bancoDestino) throws Exception {
        checarOperacao(valor);
        checarOperacaoTransferencia(contaDestino, valor);
        this.setSaldo(this.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        criarTransacao(valor,"PIX",true,contaDestino);
        contaDestino.criarTransacao(valor,"PIX",false,this);
    }

    public void deposito(double valor) throws Exception{
        checarOperacao(valor);
        setSaldo(getSaldo() + valor);
        criarTransacao(valor,"DEPOSITO",false);}

    
    public void saque(double valor) throws Exception {
        checarOperacao(valor);
        if (getSaldo() < valor) {
            throw  new Exception("Você não tem dinheiro suficiente");
        }
        setSaldo(getSaldo() - valor);
        criarTransacao(valor,"SAQUE",true);}
    

//CHECAGEM

protected void checarOperacao(double valor) throws Exception {
    if ( valor <= 0 ) {
        throw new Exception("Valor insuficiente");
    }
}

protected void checarOperacaoTransferencia( Conta destino, double valor) throws Exception {
    if (this == destino) {
        throw new Exception("Transferência para a mesma conta logada");
    }
    if (this.getSaldo() < valor) {
        throw  new Exception("Valor insuficiente");
    }
}


    
}



    
