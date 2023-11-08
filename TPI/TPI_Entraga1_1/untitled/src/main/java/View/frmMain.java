package View;

import javax.swing.*;

public class frmMain extends JFrame {

    private JButton reportarIncidenteButton;
    private JButton button1;

    public frmMain(){
        setTitle("Sistema de Reportes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new frmMain();
    }
}
