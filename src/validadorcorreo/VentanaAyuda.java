/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcorreo;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class VentanaAyuda extends JFrame {
    
    private PanelAyuda ayuda;
    
    public VentanaAyuda(){
        iniciar();
    }
    
    private void iniciar(){
        setSize(500, 600);
        setLocation(350, 20);
        setResizable(false);
        setTitle("AYUDA");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        setLayout(null);
        
        ayuda = new PanelAyuda(this);
        ayuda.setBackground(Color.WHITE);
        ayuda.setBounds(50, 20, 400, 510);
        add(ayuda);
        
        
        
        setVisible(true);
        
    }
    
}
    
