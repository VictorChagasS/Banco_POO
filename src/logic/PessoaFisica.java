package logic;

public class PessoaFisica extends Pessoa {
    int CPF;
    int DataNascimento;

    public PessoaFisica(String nome, String email, int DataNascimento, int CPF) {
        super(nome,email);
        this.CPF = CPF;
        this.DataNascimento = DataNascimento;
    }
}