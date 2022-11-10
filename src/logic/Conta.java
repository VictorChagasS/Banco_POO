package logic;

public abstract class Conta{
    
    private double saldo = 1000;
    private String chavePix;
    private String senha;
    private String tipoCliente;
    private String email;
    private String numeroConta;
    private String numeroCartao;
    private Pessoa pessoa;

    public Conta(String senha, String email,Pessoa pessoa) {
        this.numeroConta = RandomNumeroConta.gerarNumeroConta();
        this.email = email;
        this.senha = senha;
        this.pessoa = pessoa;
        this.numeroCartao = RandomNumeroConta.gerarNumeroCartao();
    }

   
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public PessoaJuridica getPessoa() {
        return (PessoaJuridica) pessoa;
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

    public String getTipoCliente() {
        return tipoCliente;
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
        this.tipoCliente = tipoCliente;
    }

    public void setChave(String chavePix) {
        this.chavePix = chavePix;
    }

   

   




    
}



    
