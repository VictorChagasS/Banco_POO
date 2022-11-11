package logic;

public class ContaPJ extends Conta {
    long cnpj;

    public ContaPJ(String nome,long cnpj, String senha,String email ) {
        super(nome,senha,email);
        this.cnpj = cnpj;
    }

    
        
}
