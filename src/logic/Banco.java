package logic;
import java.util.*;

public class Banco implements Ted, Pix{
    private String bankName;
    private String agencia;
    private double taxaPIXPJ;
    private ArrayList<Conta> clientes = new ArrayList<Conta>();
    public Object value;

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
        checarOperacao(valor);
        conta.setSaldo(conta.getSaldo() + valor);
        criarTransacao(conta,valor,"DEPOSITO",false);}

    
    public void saque(Conta conta, double valor) throws Exception {
        checarOperacao(valor);
        if (conta.getSaldo() < valor) {
            throw  new Exception("Valor insuficiente");
        }
        conta.setSaldo(conta.getSaldo() - valor);
        criarTransacao(conta,valor,"SAQUE",true);}
    
    private void checarOperacao(double valor) throws Exception {
        if ( valor <= 0 ) {
            throw new Exception("Valor insuficiente");
        }
    }

    public void checarOperacaoTransferencia(Conta origem, Conta destino, double valor) throws Exception {
        if (origem == destino) {
            throw new Exception("Transferência para a mesma conta logada");
        }
        if (origem.getSaldo() < valor) {
            throw  new Exception("Valor insuficiente");
        }
    }
    public void criarTransacao(Conta conta, Double valor, String tipoTransacao, Boolean envioRecebe) {
        Transacao transacao = new Transacao(valor,tipoTransacao,envioRecebe);
        conta.addTransacao(transacao);
    } 

    public void criarTransacao(Conta conta, Double valor, String tipoTransacao, Boolean envioRecebe, String destinario) {
        Transacao transacao = new Transacao(destinario,valor,tipoTransacao,envioRecebe);
        conta.addTransacao(transacao);
    } 
   

    @Override 
    public void cadastrarChave(Conta contaDestino, String chave) {
        contaDestino.setChave(chave);
    }

    @Override 
    public String mostrarChave(Conta conta) {
        return conta.getChave();
    }
    


    @Override
    public void pagarComPix(ContaPJ origem, double valor, String chave, Banco bancoDestino) throws Exception {
        Conta contaDestino = bancoDestino.encontrarConta(chave);
        checarOperacao(valor);
        checarOperacaoTransferencia(origem, contaDestino, valor);

        origem.setSaldo(origem.getSaldo() - valor - (valor*taxaPIXPJ/100));
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        criarTransacao(origem,valor,"PIX",true,contaDestino.getNome());
        criarTransacao(contaDestino,valor,"PIX",false,origem.getNome());
    }

    @Override
    public void pagarComPix(ContaPF origem, double valor, String chave, Banco bancoDestino) throws Exception {
        Conta contaDestino = bancoDestino.encontrarConta(chave);
        checarOperacao(valor);
        checarOperacaoTransferencia(origem, contaDestino, valor);

        origem.setSaldo(origem.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        criarTransacao(origem,valor,"PIX",true,contaDestino.getNome());
        criarTransacao(contaDestino,valor,"PIX",false,origem.getNome());
    }

    
    @Override
    public void transferenciaTed(Conta origem,Banco bancoDestino, String numeroContaDestino, double valor) throws Exception{
        Conta contaDestino = bancoDestino.encontrarConta(numeroContaDestino);
        checarOperacao(valor);
        checarOperacaoTransferencia(origem, contaDestino, valor);

        origem.setSaldo(origem.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        criarTransacao(origem,valor,"TED",true,contaDestino.getNome());
        criarTransacao(contaDestino,valor,"TED",false,origem.getNome());
        
    }
    
  
    public void addInBank(Conta conta) throws Exception {
        try {
            encontrarConta(conta.getNumeroConta());
        }
        catch(Exception e) {
            clientes.add(conta);
        }
    }

    public void RemoveInBank(Conta cliente) {
        clientes.remove(cliente);  
    }

   
    public Conta encontrarConta(String numeroContaouChave) throws Exception{
        Iterator<Conta> clientesIterator = clientes.iterator();
        while(clientesIterator.hasNext()) {
            Conta cliente = clientesIterator.next();
            if ( (cliente.getNumeroConta().equals(numeroContaouChave)) || (cliente.getChave().equals(numeroContaouChave))) {
                return cliente;
            }
        }
        throw new Exception("Conta não encontrada");
         
    }





    }
    
    //METODOS DE COMUNICACAO
