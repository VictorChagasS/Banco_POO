package logic;

import java.util.*;

public class SistemaBancos {
    private static ArrayList<Banco> bancos = new ArrayList<Banco>();

    public static void add(Banco banco) {
        if (checkBanco(banco.getAgencia())) {
            System.out.println("Essa agencia ja esta cadastrada");
        }
        else {
            bancos.add(banco);
        }
    }

    public static void add(Banco[] bancosLista) {
        for(Banco banco:bancosLista) {
            bancos.add(banco);
         }
    }

    public static void removerBanco(Banco banco) {
        bancos.remove(banco);
    }

    public static long encontrarConta(int numeroConta ) {
        Iterator<Banco> bancosIterator =bancos.iterator();
        while(bancosIterator.hasNext()) { 
            Banco banco = bancosIterator.next();
            while(banco.getClientes().hasNext()) {
                if (numeroConta == banco.getClientes().next().getNumeroConta()){
                    return banco.getClientes().next().getSaldo();
                }
            }

        }
        return 99999;
    }

    public static boolean checkBanco(int agencia) {
        Iterator<Banco> bancosIterator =bancos.iterator();
        while(bancosIterator.hasNext()) {
            Banco bancoAchado = bancosIterator.next();
            if (bancoAchado.getAgencia() == agencia) {
                return true;
            }
        }
        return false;
    }

    public static Banco encontrarBanco(int agencia) {
        Iterator<Banco> bancosIterator =bancos.iterator();
        while(bancosIterator.hasNext()) {
            Banco bancoAchado = bancosIterator.next();
            if (bancoAchado.getAgencia() == agencia) {
                return bancoAchado;
            }
        }
        return null;
    }

}