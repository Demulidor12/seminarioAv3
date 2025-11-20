package com.unileste.projetofinal.gui;

import javax.swing.*;
import java.awt.*;

public class ContaPanel extends JPanel {
    
    public ContaPanel() {
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblNum = new JLabel("Número da Conta:");
        JTextField txtNum = new JTextField();

        JLabel lblAgencia = new JLabel("Agência:");
        JTextField txtAgencia = new JTextField();

        JLabel lblSaldo = new JLabel("Saldo Inicial:");
        JTextField txtSaldo = new JTextField();

        JButton btnCriarConta = new JButton("Criar Conta");

        add(lblNum);
        add(txtNum);
        add(lblAgencia);
        add(txtAgencia);
        add(lblSaldo);
        add(txtSaldo);
        add(new JLabel());
        add(btnCriarConta);
    }
}
