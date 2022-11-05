package logic;

public interface Pix {
    void cadastrarChave(String chave);
    void pagarComPix(double valor, String chave);    
    void mostrarChave();
    
}