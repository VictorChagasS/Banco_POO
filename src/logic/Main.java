package logic;

public class Main{
    public static void main(String[] args) {
        
        Banco santa = new Banco("santa", 0, 5);
        Banco la = new Banco("la", 02, 5) ;

        SistemaBancos.add(la);
        SistemaBancos.add(santa);
    
        PessoaFisica Guilherme = new PessoaFisica("Gui","v",28112002,03333);

        ContaPF k = new ContaPF(Guilherme, 0,santa , null);
        PessoaJuridica Guilherme1 = new PessoaJuridica("Gui","v",03333);
        ContaPJ k2 = new ContaPJ(Guilherme1, 0,santa , "");

        santa.addInBank(k);
        santa.addInBank(k2);

        

        System.out.println(k.getSaldo());
        k.deposito(500);
        System.out.println(k.getSaldo());
        k.saque(200);
        System.out.println(k.getSaldo());

        System.out.println( SistemaBancos.encontrarBanco(02));

       
        

        


    }

}