
package validadorcorreo;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelVer extends JPanel{
    VentanaVer ventana2;
    JTable tabla;
    DefaultTableModel dtm;
    Object[] data;
    
    public PanelVer(VentanaVer ventana2){
        this.ventana2 = ventana2;
         setBorder(BorderFactory.createTitledBorder(""));
         setLayout(null);
         
         dtm= new DefaultTableModel();
        tabla = new JTable(dtm);
        dtm.addColumn("CORREO ELECTRONICO");
        dtm.addRow(data);

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(30, 20, 400, 510);
        add(scrollPane);
    }
    
    public void actualizarTabla(){
        
    }
    
    
}
