package logic;

public interface Pix {
    void cadastrarChave(String chave);
    void pagarComPix(double valor, Conta contaDestino, Banco bancoDestino) throws Exception;  
    String mostrarChave();
    
}