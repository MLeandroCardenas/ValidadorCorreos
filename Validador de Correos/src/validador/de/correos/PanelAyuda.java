
package validador.de.correos;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelAyuda extends JPanel {
    
    VentanaAyuda ventana3;
    private JTextArea area;
    
    public PanelAyuda(VentanaAyuda ventana3){
        this.ventana3 = ventana3;
        setBorder(BorderFactory.createTitledBorder(""));
        setLayout(null);
    }
}
