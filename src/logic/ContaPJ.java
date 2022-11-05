package logic;

public class ContaPJ extends Conta {
    private PessoaJuridica pessoa;

    public ContaPJ(PessoaJuridica pessoa, int numeroConta, Banco banco, String senha ) {
        super(numeroConta,banco,senha);
        this.pessoa = pessoa;
        this.setTipoCliente("PJ");
    }



    @Override
    public void pagarComPix(double valor, String chaveDestino) {
        System.out.println(2);
    }

    @Override
    public void pagarComTed(double valor, int agencia, int numeroConta, int cpf) {
        System.out.println("Pagou com TED");
    }

    
        
}
