package logic;

public class ContaPF extends Conta {
    String cpf;
    int dataNasc;
    

    public ContaPF(String nome,String cpf, String senha, String email,int dataNasc ) {
        super(nome,senha,email);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        cartao.setLimite(1500);
    }

    @Override
    public Integer getDataNasc() {
        return dataNasc;
    }

    public String getCPF(){
        return cpf;
    }

    
    
    
        
}
