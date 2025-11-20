package com.unileste.projetofinal.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    
    private ClientePanel clientePanel;
    private ContaPanel contaPanel;
    private OperacoesPanel operacoesPanel;

    public MainFrame() {
        setTitle("Sistema Bancário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        clientePanel = new ClientePanel();
        contaPanel = new ContaPanel();
        operacoesPanel = new OperacoesPanel();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Cliente", clientePanel);
        tabbedPane.addTab("Conta", contaPanel);
        tabbedPane.addTab("Operações", operacoesPanel);

        add(tabbedPane, BorderLayout.CENTER);
    }
}
