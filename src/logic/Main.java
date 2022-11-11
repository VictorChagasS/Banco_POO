package logic;

import pages.Login;

public class Main{
    public static void main(String[] args) throws Exception {
            
                new Login().setVisible(true);
              

        

        System.out.println(RandomNumeroConta.gerarNumeroConta());
    

        Banco banco1 = new Banco("SANTANDER", "a", 3);
        Banco banco2 = new Banco("BRADESCO", "b", 3);
        Banco banco3 = new Banco("BABATUE", "c", 3);
        SistemaBancos.add(banco1);
        SistemaBancos.add(banco2);
        SistemaBancos.add(banco3);


       
        ContaPF gui1 = new ContaPF("Victor",1234,"j","g",28112002);
        ContaPF i1 = new ContaPF("Gui",12354,"1","j",28112002);

       
       System.out.println(i1.getNumeroConta());
      
        SistemaBancos.register(gui1, banco2);
        SistemaBancos.register(i1, banco3);

       
       
        

 
      
          


            
    }
}
    

       
        

        