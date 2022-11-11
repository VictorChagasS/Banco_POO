package logic;

public class ContaPJ extends Conta {
    String cnpj;

    public ContaPJ(String nome,String cnpj, String senha,String email ) {
        super(nome,senha,email);
        this.cnpj = cnpj;
    }

    
        
}
