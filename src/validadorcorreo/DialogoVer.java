
package validadorcorreo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class DialogoVer extends JDialog {

    VentanaPrincipal k;
    
    public DialogoVer(VentanaPrincipal frame){
        
        k = frame;
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("VER CORREOS");
        setSize(500,600);
        setLayout(new GridLayout(6, 1));
        setBackground(Color.WHITE);
        setVisible(true);   
    }   
}
