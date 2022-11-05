package logic;

public class PessoaJuridica extends Pessoa{
    long CNPJ;


    public PessoaJuridica(String nome, String email, long CNPJ) {
        super(nome,email);
        this.CNPJ = CNPJ;
    }
}
