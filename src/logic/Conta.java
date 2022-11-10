package logic;

public abstract class Conta{
    
    private double saldo = 1000;
    private String chavePix = null;
    private String senha;
    private String tipoConta;
    private String email;
    private String numeroConta;
    private Cartao cartao;
    private String nome;
    

    public Conta(String nome, String senha, String email) {
        this.nome = nome;
        this.numeroConta = RandomNumeroConta.gerarNumeroConta();
        this.email = email;
        this.senha = senha;
        cartao = new Cartao();
        cartao.setNumeroCartao(RandomNumeroConta.gerarNumeroCartao());
    }

    public Cartao getCartao() {
        return cartao;
    }
  

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    public String getChave() {
        return chavePix;
    }


    
    public boolean verificar(String email, String senha)
    {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public String getSenha() {
        return senha;
    }

    public String getTipoConta() {
        return tipoConta;
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

    public void setTipoCliente(String tipoCliente) {
        this.tipoConta = tipoCliente;
    }

    public Integer getDataNasc(){
        return null;
    }

    public void setChave(String chavePix) {
        this.chavePix = chavePix;
    }

   

   




    
}



    
