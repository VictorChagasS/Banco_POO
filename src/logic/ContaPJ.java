package logic;

public class ContaPJ extends Conta {
    private PessoaJuridica pessoa;

    public ContaPJ(PessoaJuridica pessoa, String senha,String email ) {
        super(senha,email, pessoa);
        this.setTipoCliente("PJ");
    }

    
        
}
