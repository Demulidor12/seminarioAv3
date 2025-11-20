package com.unileste.projetofinal.gui;

import javax.swing.*;
import java.awt.*;

public class ClientePanel extends JPanel {

    public ClientePanel() {
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblNome = new JLabel("Nome do Cliente:");
        JTextField txtNome = new JTextField();

        JLabel lblCpf = new JLabel("CPF:");
        JTextField txtCpf = new JTextField();

        JLabel lblTelefone = new JLabel("Telefone:");
        JTextField txtTelefone = new JTextField();

        JButton btnSalvar = new JButton("Salvar Cliente");

        add(lblNome);
        add(txtNome);
        add(lblCpf);
        add(txtCpf);
        add(lblTelefone);
        add(txtTelefone);
        add(new JLabel());
        add(btnSalvar);
    }
}
