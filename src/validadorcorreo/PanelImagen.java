/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcorreo;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelImagen extends JPanel{
    private JLabel imagen;

    public PanelImagen() {
        ImageIcon icon=new ImageIcon("imagenes/logo.JPG");
        imagen=new JLabel();
        imagen.setIcon(icon);
        add(imagen);
        setBackground(Color.WHITE);
        
    }
    
}
