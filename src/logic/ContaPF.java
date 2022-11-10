package logic;

public class ContaPF extends Conta {

    public ContaPF(PessoaFisica pessoa, String senha, String email ) {
        super(senha,email,pessoa);
        this.setTipoCliente("PF");
     
    }


    
    
        
}
