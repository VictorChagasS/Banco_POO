package logic;
import java.util.*;

public class Banco implements Ted, Pix{
    private String bankName;
    private String agencia;
    private double taxaPIXPJ;
    private ArrayList<Conta> clientes = new ArrayList<Conta>();

    public Banco(String bankName, String agencia, double taxaPIXPJ){
        this.bankName = bankName;
        this.agencia = agencia;
        this.taxaPIXPJ = taxaPIXPJ;

    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome() {
        return bankName;
    }

    public void deposito(Conta conta, double valor) throws Exception{
        if (encontrarConta(conta.getNumeroConta())==null) {
            throw new Exception("Conta nao existe no banco");
        }
        else {
        if (valor > 0){
           conta.setSaldo(conta.getSaldo() + valor);
        } 
        else {
            throw new Exception("Valor insuficiente");
        }
    }
    }

    public void saque(Conta conta, double valor) throws Exception {
        if  (encontrarConta(conta.getNumeroConta())==null){
            throw new Exception("Conta nao existe no banco");
        }
        else {
        if (valor > 0 && conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
        }
        else {
            throw new Exception("Valor insuficiente");
        }
    }
    }

    @Override 
    public void cadastrarChave(Conta contaDestino, String chave) {
        contaDestino.setChave(chave);
    }

    @Override 
    public String mostrarChave(Conta conta) {
        return conta.getChave();
    }

    public void pagarComPix(double valor, String chave) {}
    @Override
    public void transferenciaTed(Conta origem,Banco bancoDestino, Conta contaDestino, double valor) throws Exception{
        saque(origem,valor);
        bancoDestino.deposito(contaDestino, valor);
        
    }
    
  
    public void addInBank(Conta conta) {
        if (encontrarConta(conta.getNumeroConta()) != null){
            System.out.println("Conta já existente no banco");
        }
        else{
        clientes.add(conta);  
            }
    }

    public void RemoveInBank(Conta cliente) {
        clientes.remove(cliente);  
    }

   
    public Conta encontrarConta(String numeroConta) {
        Iterator<Conta> clientesIterator = clientes.iterator();
        while(clientesIterator.hasNext()) {
            Conta cliente = clientesIterator.next();
            if (cliente.getNumeroConta().equals(numeroConta)) {
                return cliente;
            }
        }
        return null;
    }




    }
    
    //METODOS DE COMUNICACAO
