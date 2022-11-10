package pages.componentes;

import javax.swing.*;

import logic.SistemaBancos;
import pages.Login;


public class MenuLateral extends JPanel {

   
    public MenuLateral() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEsq = new JPanel();
        nome = new JLabel();
        icone = new JLabel();
        agencia = new JLabel();
        numConta = new JLabel();
        sair = new JLabel();

        setMaximumSize(new java.awt.Dimension(297, 570));
        setPreferredSize(new java.awt.Dimension(287, 570));
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });


        menuEsq.setBackground(new java.awt.Color(34, 180, 167));

        nome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setHorizontalAlignment(SwingConstants.CENTER);
        nome.setText(SistemaBancos.LoggedInUser.getConta().getNome());

        icone.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        icone.setForeground(new java.awt.Color(255, 255, 255));
        icone.setHorizontalAlignment(SwingConstants.CENTER);
        icone.setIcon(new ImageIcon(getClass().getResource("../icons/userMenor.png"))); // NOI18N

        agencia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        agencia.setForeground(new java.awt.Color(255, 255, 255));
        agencia.setHorizontalAlignment(SwingConstants.CENTER);
        agencia.setText(SistemaBancos.LoggedInUser.getBanco().getAgencia());

        numConta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numConta.setForeground(new java.awt.Color(255, 255, 255));
        numConta.setHorizontalAlignment(SwingConstants.CENTER);
        numConta.setText(SistemaBancos.LoggedInUser.getConta().getNumeroConta());

        sair.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setHorizontalAlignment(SwingConstants.CENTER);
        sair.setIcon(new ImageIcon(getClass().getResource("../icons/sair (1).png"))); // NOI18N
        sair.setText("Sair");
        sair.setMaximumSize(new java.awt.Dimension(100, 100));
        sair.setPreferredSize(new java.awt.Dimension(343, 256));

        GroupLayout menuEsqLayout = new GroupLayout(menuEsq);
        menuEsq.setLayout(menuEsqLayout);
        menuEsqLayout.setHorizontalGroup(
            menuEsqLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(icone, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuEsqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuEsqLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nome, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agencia, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuEsqLayout.createSequentialGroup()
                        .addComponent(sair, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menuEsqLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(menuEsqLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(numConta, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuEsqLayout.setVerticalGroup(
            menuEsqLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, menuEsqLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icone)
                .addGap(18, 18, 18)
                .addComponent(nome)
                .addGap(63, 63, 63)
                .addComponent(agencia)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(menuEsqLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(menuEsqLayout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(numConta)
                    .addContainerGap(328, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuEsq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(menuEsq, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    
    private void sairMouseClicked(java.awt.event.MouseEvent evt) {                                  
        Login login = new Login();
        SwingUtilities.getWindowAncestor(this).dispose();
        login.setVisible(true);
    }                                 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel agencia;
    private JLabel icone;
    private JPanel menuEsq;
    private JLabel nome;
    private JLabel numConta;
    private JLabel sair;
    // End of variables declaration//GEN-END:variables
}
