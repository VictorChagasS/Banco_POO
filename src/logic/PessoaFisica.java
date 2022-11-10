package logic;

public class PessoaFisica extends Pessoa {
    private int CPF;
    private int DataNascimento;

    public PessoaFisica(String nome, int DataNascimento, int CPF) {
        super(nome);
        this.CPF = CPF;
        this.DataNascimento = DataNascimento;
    }

    public int getCPF(){
        return CPF;
    }
}