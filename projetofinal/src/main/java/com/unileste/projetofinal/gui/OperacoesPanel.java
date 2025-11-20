package com.unileste.projetofinal.gui;

import javax.swing.*;
import java.awt.*;

public class OperacoesPanel extends JPanel {
    
    public OperacoesPanel() {
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblValor = new JLabel("Valor da Operação:");
        JTextField txtValor = new JTextField();

        JButton btnDepositar = new JButton("Depositar");
        JButton btnSacar = new JButton("Sacar");
        JButton btnTransferir = new JButton("Transferir");

        add(lblValor);
        add(txtValor);
        add(btnDepositar);
        add(btnSacar);
        add(btnTransferir);
        add(new JLabel());
    }
}
