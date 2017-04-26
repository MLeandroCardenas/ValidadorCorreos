
package validadorcorreo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DialogoAyuda extends JDialog   {

    
    VentanaPrincipal j;
    private PanelAyuda ayuda;
 
    
    public DialogoAyuda() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("AYUDA");
        setSize(500,600);
        setLayout(new GridLayout(6, 1));
        setBackground(Color.WHITE);
        setVisible(true);
        
  
        ayuda = new PanelAyuda(this);
        ayuda.setBackground(Color.WHITE);
        ayuda.setBounds(10, 20, 500, 510);
        add(ayuda);
        
        
    }
}
