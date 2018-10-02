/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Saca el menu y recupera la opcion del usuario
        int opcion=EntradaSalida.obtenerOpcion();
        
        while(opcion!=4)
        {
            switch (opcion)
            {
                case 1:
                    Contacto c=EntradaSalida.pedirContacto();
                    AccesoFichero.grabarContacto(c);
                    break;
                case 2:
                    ArrayList<Contacto> lista=AccesoFichero.obtenerContactos();
                    EntradaSalida.mostrarContactos(lista);
                    break;
                case 3:
                   String nombre=EntradaSalida.pedirNombre();
                    Contacto c_buscado=AccesoFichero.buscarContacto(nombre);
                    EntradaSalida.mostrarContacto(c_buscado);
                    break;
               }
             opcion=EntradaSalida.obtenerOpcion();  
        }
    }
    
}
