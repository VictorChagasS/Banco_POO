package logic;

public class ContaPF extends Conta {
    private PessoaFisica pessoa;

    public ContaPF(PessoaFisica pessoa, int numeroConta, Banco banco, String senha ) {
        super(numeroConta,banco,senha);
        this.pessoa = pessoa;
        this.setTipoCliente("PF");
     
    }
    @Override
    public void pagarComPix(double valor, String chaveDestino) {
        System.out.println("Pagou com PF sem taxa");
    }

    @Override
    public void pagarComTed(double valor, int agencia, int numeroConta, int cpf) {
        System.out.println("Pagou com TED");
    }
   




    

    
    
        
}
