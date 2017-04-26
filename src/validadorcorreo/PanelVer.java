
package validadorcorreo;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelVer extends JPanel{
    VentanaPrincipal ventana2;
        JTable tabla;
        DefaultTableModel dtm;
        Object[] data;
    
        public PanelVer(){
        dtm= new DefaultTableModel();
        tabla = new JTable(dtm);
        dtm.addColumn("DIRRECCION CORREO ELECTRONICO");
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(15, 30, 370, 400);
        add(scrollPane);
        }
}
