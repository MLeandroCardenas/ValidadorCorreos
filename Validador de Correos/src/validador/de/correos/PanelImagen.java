/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador.de.correos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelImagen extends JPanel{
    private JLabel imagen;

    public PanelImagen() {
        setLayout(null);
        ImageIcon icon=new ImageIcon("imagenes/chulo.PNG");
        imagen=new JLabel();
        imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        imagen.setBounds(50, 20, 100, 100);
        add(imagen);
        setBackground(Color.WHITE);
    }
    public void Repintar(String a){
        setLayout(null);
        ImageIcon icon=new ImageIcon(a);
        imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
        imagen.setBounds(50, 20, 100, 100);
        add(imagen);
        setBackground(Color.WHITE);
        repaint();
    }
    
}
