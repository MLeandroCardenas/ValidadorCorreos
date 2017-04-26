/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcorreo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelVentana extends JPanel {

    VentanaPrincipal ventana1;
    JLabel Lcorreo;
    JTextField JTCorreo;
    PanelImagen panelImagen;

    public PanelVentana(VentanaPrincipal ventana1) {
        
        this.ventana1 = ventana1;
        setBorder(BorderFactory.createTitledBorder(""));
        setLayout(null);
        
        panelImagen=new PanelImagen();
        add(panelImagen);
        panelImagen.setBounds(100, 40, 200, 150);
        
        Lcorreo = new JLabel("Ingrese su correo: ");
        JTCorreo = new JTextField();
        Lcorreo.setBounds(80, 255, 120, 30);
        JTCorreo.setBounds(80, 280, 250, 20);
        add(Lcorreo);
        add(JTCorreo);  
     
    }

}
