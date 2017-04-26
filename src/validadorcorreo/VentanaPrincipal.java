
package validadorcorreo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class VentanaPrincipal extends JFrame implements ActionListener{
    
    private PanelVentana panel;
    
    private JMenuBar mb;
    
    private JMenu menu1;
    
    private JMenuItem mi1,mi2,mi3;
    
    private DialogoAyuda ayuda;
    
    private DialogoVer ver;
    
    public VentanaPrincipal() {
        iniciar();
    }
    
    public void iniciar(){
        setSize(500, 600);
        setLocation(350, 20);
        setResizable(false);
        setTitle("Michael Cardenas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        setLayout(null);
       
        panel = new PanelVentana(this);
        panel.setBackground(Color.WHITE);
        panel.setBounds(50, 20, 400, 510);
        add(panel);
       
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        menu1 = new  JMenu("Principal");
        mb.add(menu1);
        
        mi1 = new JMenuItem("Ayuda");
        mi1.addActionListener(this);
        mi1.setActionCommand("AYUDA");
        menu1.add(mi1);
        mi2 = new JMenuItem("Salir");
        mi2.addActionListener(this);
        mi2.setActionCommand("SALIR");        
        menu1.add(mi2);
        
        menu1 = new JMenu("Informacion");
        mb.add(menu1);
        mi3 = new JMenuItem("Ver");
        mi3.addActionListener(this);
        mi3.setActionCommand("VER");
        menu1.add(mi3);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==mi1) {
            System.out.println("entro a ayuda");
            ayuda = new DialogoAyuda();
        }
        if(e.getSource() == mi2){
            System.out.println("entro a salir");
            System.exit(0);
    }
         if(e.getSource() == mi3){
             System.out.println("entro a ver");
             ver = new DialogoVer(this);
         } 
  }
 
}