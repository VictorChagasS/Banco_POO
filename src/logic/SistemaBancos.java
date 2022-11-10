package logic;

import java.util.*;

import javax.swing.JOptionPane;

public class SistemaBancos{
    public static HashMap<String,Pair<Banco,Conta>> contasRegistradas = new HashMap<String,Pair<Banco,Conta>>();
    public static ArrayList<Banco> bancos = new ArrayList<Banco>();

    public static void add(Banco banco) {
        if (checkBanco(banco.getAgencia())) {
            System.out.println("Essa agencia ja esta cadastrada");
        }
        else {
            bancos.add(banco);
        }
    }

   

    public static void register(Conta conta,Banco banco) throws Exception{
        if(contasRegistradas.containsKey(conta.getEmail())) {
            throw new Exception("Conta já existe"); 
        }
        else {
        banco.addInBank(conta);
        Pair par = new Pair(banco, conta);
        contasRegistradas.put(conta.getEmail(),par);
    
        }
    }

    


    public static LoggedInUser logIn(String name, String password) throws Exception 
    {
        if(!contasRegistradas.containsKey(name)) {
            throw new Exception("Usuario nao existe");
        }
        if(contasRegistradas.get(name).conta.verificar(name, password))
        {
            System.out.println("User " + name + " logged in succesfully");
            return new  LoggedInUser((contasRegistradas.get(name).banco),(contasRegistradas.get(name).conta));
        }
            throw new Exception("Crendeciais erradas");
    }

    public static class LoggedInUser
    {
        private static Conta loggedAcount;
        private static Banco loggedBank;
        public static Conta getConta() {
            return loggedAcount;
        }
        public static Banco getBanco() {
            return loggedBank;
        }
        LoggedInUser(Banco banco, Conta account)
        {
            this.loggedAcount = account;
            this.loggedBank = banco;
   
        }

        public static void deslogar() {
            loggedAcount = null;
        }
       
    }

    public static Conta encontrarConta(String agencia, String numeroConta ) throws Exception {
        Banco bancoAchado = encontrarBanco(agencia);
        
        return bancoAchado.encontrarConta(numeroConta);
    }

    public static boolean checkBanco(String agencia) {
        Iterator<Banco> bancosIterator =bancos.iterator();
        while(bancosIterator.hasNext()) {
            Banco bancoAchado = bancosIterator.next();
            if (bancoAchado.getAgencia().equals(agencia)) {
                return true;
            }
        }
        return false;
    }
   

    public static Banco encontrarBanco(String agencia) throws Exception{
        Iterator<Banco> bancosIterator = bancos.iterator();
        while(bancosIterator.hasNext()) {
            Banco bancoAchado = bancosIterator.next();
            if (bancoAchado.getAgencia().equals(agencia)) {
                return bancoAchado;
            }
        }
       throw new Exception("Banco nao existe");
    }    

}