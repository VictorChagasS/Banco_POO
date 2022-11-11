package logic;

public interface Ted {
    void transferenciaTed(Conta origem, Banco bancoDestino, String numeroContaDestino, double valor) throws Exception;    
}