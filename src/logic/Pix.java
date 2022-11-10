package logic;

public interface Pix {
    void cadastrarChave(Conta contaCorrespondente, String chave);
    void pagarComPix(ContaPF origem, double valor, Conta contaDestino, Banco bancoDestino) throws Exception;  
    void pagarComPix(ContaPJ origem, double valor, Conta contaDestino, Banco bancoDestino) throws Exception;    
    String mostrarChave(Conta conta);
    
}