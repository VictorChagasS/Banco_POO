package logic;

public class PessoaJuridica extends Pessoa{
    int CNPJ;


    public PessoaJuridica(String nome, int CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
    }
    public int getCNPJ(){
        return CNPJ;
    }
}
