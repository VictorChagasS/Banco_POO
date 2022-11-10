package logic;

public interface Pix {
    void cadastrarChave(Conta contaCorrespondente, String chave);
    void pagarComPix(double valor, String chave);    
    String mostrarChave(Conta conta);
    
}