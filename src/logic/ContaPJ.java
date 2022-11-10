package logic;

public class ContaPJ extends Conta {
    int cnpj;

    public ContaPJ(String nome,int cnpj, String senha,String email ) {
        super(nome,senha,email);
        this.cnpj = cnpj;
    }

    
        
}
