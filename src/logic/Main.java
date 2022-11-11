package logic;

import pages.Login;

public class Main{
    public static void main(String[] args) throws Exception {
            
                new Login().setVisible(true);
              

        
    

        Banco sant = new Banco("Santander", "033", 3);
        Banco brad = new Banco("Bradesco", "237", 3);
        Banco itau = new Banco("Itaú", "0500", 3);
        SistemaBancos.add(sant);
        SistemaBancos.add(brad);
        SistemaBancos.add(itau);


       
        ContaPF victor = new ContaPF("Victor Chagas","01234567891","123","victor@santander.com",28112002);
        ContaPF gui = new ContaPF("Guilherme Argolo","01234564391","0101","gui@itau.com",28112002);

       
        System.out.println(victor.getNumeroConta());
        System.out.println(gui.getNumeroConta());
      
        SistemaBancos.register(victor, sant);
        SistemaBancos.register(gui, itau);

       
       
        

 
      
          


            
    }
}
    

       
        

        