package logic;

public class ContaPF extends Conta {
    long cpf;
    int dataNasc;
    

    public ContaPF(String nome,long cpf, String senha, String email,int dataNasc ) {
        super(nome,senha,email);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        setTipoCliente("PF");
    }

    @Override
    public Integer getDataNasc() {
        return dataNasc;
    }

    public long getCPF(){
        return cpf;
    }
    
    
        
}
