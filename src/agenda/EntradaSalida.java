/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class EntradaSalida {
    static Scanner sc=new Scanner(System.in);
    public static int obtenerOpcion()
    {
        System.out.println("1-Insertar contacto");
        System.out.println("2-Listar contactos");
        System.out.println("3-Buscar");
        System.out.println("4-Salir");
        int n=sc.nextInt();
        sc.nextLine();
        return n;
    }
    public static Contacto pedirContacto()
    {
        System.out.println("Introduce el nombre");
        String nombre=sc.nextLine();
        System.out.println("Introduce el teléfono");
        String telefono=sc.nextLine();
        Contacto c=new Contacto(nombre, telefono);
        return c;
    }
    public static void mostrarContactos(ArrayList<Contacto> lista)
    {
        for (int i=0; i<lista.size(); i++)
        {
            System.out.println(lista.get(i).toString());
        }
    }
    public static String pedirNombre()
    {
        System.out.println("Introduce el nombre a buscar");
        return sc.nextLine();
    }
    public static void mostrarContacto(Contacto c)
    {
        if (c!=null)
        {
        System.out.println("ENCONTRADO: \n"+c.toString());
        }
        else
        {
            System.out.println("No existe ese contacto");
        }
        
    }
}
