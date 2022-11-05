package logic;
import java.util.*;

public class Banco{
    private String bankName;
    private int agencia;
    private double taxaPIXPJ;
    private ArrayList<Conta> clientes = new ArrayList<Conta>();

    public Banco(String bankName, int agencia, double taxaPIXPJ){
        this.agencia = agencia;
        this.taxaPIXPJ = taxaPIXPJ;

    }

    public int getAgencia() {
        return agencia;
    }

    public Iterator<Conta>  getClientes() {
        Iterator<Conta> clientesIterator =clientes.iterator();
        return clientesIterator;
    }




    public void addInBank(ContaPF cliente) {
        if (clientes.contains(cliente)){
            System.out.println("Conta já existente no banco");
        }
        else{
        clientes.add(cliente);  
            }
    }

    public void addInBank(ContaPJ cliente) {
        if (clientes.contains(cliente)){
            System.out.println("Conta já existente no banco");
        }
        else{
        clientes.add(cliente);  
            } 
    }

    public void RemoveInBank(ContaPJ cliente) {
        clientes.remove(cliente);  
    }

    public void RemoveInBank(ContaPF cliente) {
        clientes.remove(cliente);  
    }

    
    public Conta encontrarConta(int numeroConta) {
        Iterator<Conta> clientesIterator =clientes.iterator();
        while(clientesIterator.hasNext()) {
            Conta cliente = clientesIterator.next();
            if (cliente.getNumeroConta() == numeroConta) {
                return cliente;
            }
        }
        return null;
    }


    //METODOS DE COMUNICACAO

    


    
    


}