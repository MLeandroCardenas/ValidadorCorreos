
package validadorcorreo;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelAyuda extends JPanel {
    DialogoAyuda ventana2;
    
    public PanelAyuda(DialogoAyuda ventana2) {
           this.ventana2 = ventana2;
            setBorder(BorderFactory.createTitledBorder(""));
            setLayout(null);
            
    }
}
