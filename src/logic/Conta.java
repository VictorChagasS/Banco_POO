package logic;

public abstract class Conta implements Pix, Ted{
    
    private int numeroConta;
    private long saldo = 1000;

    
    private Banco banco;
    private String tipoCliente;
 
    public Conta(int numeroConta, Banco banco, String senha) {
        this.numeroConta = numeroConta;
        this.banco = banco;
    
    }

   
    public String getTipoCliente() {
        return tipoCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setNumeroConta( int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }


    public void deposito(long valor){
        if (valor > 0){
           this.saldo += valor;
        } 
        else {
            System.out.println("ERRO");
        }
    }

    public void saque(long valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        }
    }



    @Override 
    public void cadastrarChave(String chave) {
        System.out.println("Cadastro matueéachavedomundo");
    }

    @Override 
    public void mostrarChave() {
        System.out.println("matueéachavedomundo");
    }


    
}



    
