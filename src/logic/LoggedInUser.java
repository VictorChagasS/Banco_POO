package logic;

public class LoggedInUser
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
        loggedAcount = account;
        loggedBank = banco;

    }

    public static void deslogar() {
        loggedAcount = null;
    }
   
}

