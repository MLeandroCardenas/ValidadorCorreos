/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import validador.de.correos.VentanaPrincipal;

/**
 *
 * @author EDGAR
 */
public class validarCorreo {
    VentanaPrincipal menu;
    StringBuilder correo;
    boolean bandera=false;
    int cont=0;
    int cont3=0;
    int cont2=0;
    boolean bandera2=false;
    public validarCorreo(StringBuilder correo,VentanaPrincipal aux) {
        this.correo=correo;
        menu=aux;
        verificar();
    }
    private void verificar(){
        if (correo.length()>=4){
            char cad[];
            cad=correo.toString().toCharArray();
            for (int i=0;i<cad.length;i++){
                if ((cad[0]!='.')&&(cad[0]!='@')){
                    if (cad[i]=='@'){
                        cont++;
                        if((i+1)!=cad.length){
                             if ((cad[i]=='@')&&(cad[i+1]=='.')){
                                bandera=true;
                                menu.panel.panelImagen.Repintar("imagenes/mal.PNG");
                                menu.panel.cambiarEtiqueta("depues del @ no va un punto");
                                menu.panel.ocultarBoton();
                                break;
                            }
                             else{
                                  menu.panel.panelImagen.Repintar("imagenes/Chulo.PNG");
                                  menu.panel.cambiarEtiqueta("Falta el dominio del correo");
                                  menu.panel.ocultarBoton();
                             }
                        }
                        else{
                            menu.panel.panelImagen.Repintar("imagenes/Chulo.PNG");
                            menu.panel.cambiarEtiqueta("Falta el dominio del correo");
                            menu.panel.ocultarBoton();
                        }
                    }
                    else{
                        if (cont==0){
                            menu.panel.panelImagen.Repintar("imagenes/mal.PNG");
                            menu.panel.cambiarEtiqueta("DEBE TENER EL @");
                            menu.panel.ocultarBoton();
                        }
                        else{
                            if (bandera==false){
                            if (cad[i]=='.'){
                                cont2++;
                                if (i+1!=cad.length){
                                    if (cad[i+1]=='.'){
                                        menu.panel.panelImagen.Repintar("imagenes/mal.PNG");
                                        menu.panel.cambiarEtiqueta("No puede terminar en punto");
                                        menu.panel.ocultarBoton();
                                        }
                                    }
                                else{
                                        menu.panel.panelImagen.Repintar("imagenes/mal.PNG");
                                        menu.panel.cambiarEtiqueta("No puede terminar en punto");
                                        menu.panel.ocultarBoton();
                                    }
                                }
                            else{
                               // System.out.println("CASO EN EL QUE SOLO FALTA EL .COM");
                                    if ((cad[i]!='.')&&(cont2>0)){
                                        menu.panel.panelImagen.Repintar("imagenes/Chulo.PNG");
                                        menu.panel.cambiarEtiqueta("correo valido");
                                        verificarExistencia(correo.toString());
                                        break;
                                        }
                                        else{
                                            menu.panel.panelImagen.Repintar("imagenes/mal.PNG");
                                            menu.panel.cambiarEtiqueta("FALTA FINALIZAR CON .EDU,.COM,ETC");
                                            menu.panel.ocultarBoton();
                                        }
                                }
                            }
                            bandera=false;
                        }
                    }
                }
                else{
                    menu.panel.panelImagen.Repintar("imagenes/mal.PNG");
                    menu.panel.cambiarEtiqueta("No se puede iniciar con punto o @");
                    menu.panel.ocultarBoton();
                    break;
                }
            }
            cont=0;
            cont2=0;
        }
        else{
            System.out.println("POCA INFO");
            menu.panel.ocultarBoton();
        }
    }
    private void verificarExistencia(String f){
       if (menu.canciones.isEmpty()){
           menu.panel.visualizarBoton();
           menu.panel.cambiarEtiqueta("correo Disponible A");
       }
       else{
            for(String a : menu.canciones){
                if (a.equals(f)){
                    cont3++;
                    System.out.println("ENTRO IGUALDAD");
                }
                System.out.print(a);
            }
            if (cont3==0){
                    menu.panel.cambiarEtiqueta("correo Disponible");
                    menu.panel.visualizarBoton();
            }
            else{
                menu.panel.cambiarEtiqueta("EL correo ya existe");
                menu.panel.ocultarBoton();
                cont3=0;
            }
       }
    }
}
