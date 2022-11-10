package logic;

import pages.Login;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws Exception {
            
                new Login().setVisible(true);
              

        



        

        System.out.println(RandomNumeroConta.gerarNumeroConta());
        Scanner leitor = new Scanner(System.in);/*essa linha*/

        Banco banco1 = new Banco("SANTANDER", "a", 3);
        Banco banco2 = new Banco("BRADESCO", "b", 3);
        Banco banco3 = new Banco("BABATUE", "c", 3);
        SistemaBancos.add(banco1);
        SistemaBancos.add(banco2);
        SistemaBancos.add(banco3);


        PessoaFisica gui = new PessoaFisica("Guilherme", 28112002, 132832393);
        ContaPF gui1 = new ContaPF(gui, "1", "g");

        PessoaFisica i = new PessoaFisica("Guilherme", 28112002, 132832393);
        ContaPF i1 = new ContaPF(i, "1", "j");


       System.out.println(i1.getNumeroConta());
      
        SistemaBancos.register(gui1, banco3);
        SistemaBancos.register(i1, banco1);

        SistemaBancos.logIn("g", "1");
       
        

 
       System.out.println(gui1.getSaldo());
        while (true){
            System.out.println("0-Cadastrar, 1-Logar");
            int opcao = leitor.nextInt();

        if (opcao == 0) {
            System.out.println("Digite o tipo de conta");
            String tipo = leitor.nextLine();
       
        
            System.out.println("Digite o SEU NOME");
            String nome = leitor.nextLine();
            System.out.println("Digite o SEU CPF");
            int CPF = leitor.nextInt();
            System.out.println("Digite A SENHA");
            String pass = leitor.next();

            System.out.println("Digite A SUA DATA");
            int data = leitor.nextInt();
           

            System.out.println("Digite o Email");
            String email = leitor.next();

           System.out.println(email);
           System.out.println(pass);

    
            PessoaFisica pessoa = new PessoaFisica(nome, data, CPF);
            ContaPF conta = new ContaPF(pessoa, pass, email );

            System.out.println("Digite o tipo de banco");
            int tipoBanco = leitor.nextInt();
            Banco bancousado;
        if (tipoBanco == 1) {
            System.out.println(tipoBanco);
            bancousado = banco1;
            SistemaBancos.register(conta, bancousado);
           
        }
        else {
            System.out.println(tipoBanco);
            bancousado = banco2;
            SistemaBancos.register(conta, bancousado);
        }
    }

    if (opcao == 1) {
        System.out.println("EMAIL LOGAR");
        String email = leitor.next();
        System.out.println("SENHA LOGAR");
        String senha = leitor.next();

        SistemaBancos.logIn(email, senha);


    }


            
    }}}
    

       
        

        