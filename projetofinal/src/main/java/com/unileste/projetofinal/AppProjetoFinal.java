package com.unileste.projetofinal;

import com.unileste.projetofinal.gui.LoginDialog;
import com.unileste.projetofinal.gui.MainFrame;

public class AppProjetoFinal{

    public static void main(String[] args) {
        LoginDialog loginDialog = new LoginDialog(null);
        loginDialog.setVisible(true);

        if (loginDialog.isAuthenticated()) {
            new MainFrame().setVisible(true);
        } else {
            System.out.println("Login cancelado. Encerrando aplicação.");
            System.exit(0);
        }
    }
}
