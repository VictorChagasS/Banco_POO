package logic;

public class ContaPF extends Conta {
    int cpf;
    int dataNasc;
    

    public ContaPF(String nome,int cpf, String senha, String email,int dataNasc ) {
        super(nome,senha,email);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        setTipoCliente("PF");
    }

    @Override
    public Integer getDataNasc() {
        return dataNasc;
    }

    public int getCPF(){
        return cpf;
    }
    
    
        
}
