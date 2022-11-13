package logic;

import pages.Login;

public class Main{
    public static void main(String[] args) throws Exception {
            
                new Login().setVisible(true);
    
        Banco banese = new Banco("Banese", "033", 3);
        Banco brad = new Banco("Bradesco", "237", 3);
        Banco itau = new Banco("Itaú", "0500", 3);
        SistemaBancos.add(banese);
        SistemaBancos.add(brad);
        SistemaBancos.add(itau);

       
        ContaPF victor = new ContaPF("Victor Chagas","01234567891","123","victor@banese.com","28/11/2002");
        ContaPF gui = new ContaPF("Guilherme Argolo","01234564391","0101","gui@itau.com","28/11/2002");
        ContaPJ comicBook = new ContaPJ("Comic Store Book", "03.778.130/0001-48", "gibi12", "comic@bradesco.com");

       
        System.out.println(victor.getNumeroConta());
        System.out.println(gui.getNumeroConta());
        System.out.println(comicBook.getNumeroConta());
      
        SistemaBancos.register(victor, banese);
        SistemaBancos.register(gui, itau);
        SistemaBancos.register(comicBook, brad);
            
    }
}
    

       
        

        