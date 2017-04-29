/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador.de.correos;

import Logica.validarCorreo;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelVentana extends JPanel implements KeyListener,ActionListener{

    VentanaPrincipal ventana1;
    JLabel Lcorreo;
    JTextField JTCorreo;
    JLabel etiqueta;
    public PanelImagen panelImagen;
    private StringBuilder direccion;
    JButton guardar;

    public PanelVentana(VentanaPrincipal ventana1) {
        
        this.ventana1 = ventana1;
        setBorder(BorderFactory.createTitledBorder(""));
        setLayout(null);
        
        guardar= new JButton("Guardar Correo");
        guardar.addActionListener(this);
        add(guardar);
        
        
        panelImagen=new PanelImagen();
        add(panelImagen);
        panelImagen.setBounds(100, 40, 200, 150);
        
        etiqueta= new JLabel("");
        add(etiqueta);
        etiqueta.setBounds(0,300,200,100);
        
        Lcorreo = new JLabel("Ingrese su correo: ");
        JTCorreo = new JTextField();
        JTCorreo.addKeyListener(this);
        Lcorreo.setBounds(80, 255, 120, 30);
        JTCorreo.setBounds(80, 280, 250, 20);
        add(Lcorreo);
        add(JTCorreo);  
     
    }
    public void cambiarEtiqueta(String a){
        etiqueta.setText(a);
        repaint();
    }
    public void visualizarBoton(){
        guardar.setBounds(80, 300, 150, 25);
    }
    public void ocultarBoton(){
        guardar.setBounds(0, 0, 0, 0);
    }
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        direccion= new StringBuilder();
        direccion.append(JTCorreo.getText());
        System.out.println(direccion);
        validarCorreo a= new validarCorreo(direccion,ventana1);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        ventana1.canciones.add(direccion.toString());
        System.out.println("CORREO AÑADIDO"+direccion);
        ocultarBoton();
        etiqueta.setText("Correo Añadido");
    }

}
