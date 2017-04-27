/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcorreo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VentanaVer extends JFrame implements ActionListener{
    
    private PanelVer panelVer;

    public VentanaVer(){
        iniciar();
    }
    
    private void iniciar(){
        setSize(500, 600);
        setLocation(350, 20);
        setResizable(false);
        setTitle("Correos electronicos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        setLayout(null);
        
        panelVer = new PanelVer(this);
        panelVer.setBackground(Color.WHITE);
        panelVer.setBounds(20, 15, 460, 540);
        add(panelVer);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
  

  
}
