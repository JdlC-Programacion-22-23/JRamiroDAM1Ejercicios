package programacion.Pruebas;

import java.util.Scanner;
import java.util.ArrayList;

public class PedidaCompleja {
    private String nombre;
    private String apellidos;
    private String nacionalidad;

    // Constructor
    public PedidaCompleja(String nombre, String apellidos, String nacionalidad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
    }

    // Método toString()
    public String toString(){
        return "Nombre: " + nombre + " Apellidos: " + apellidos + " Nacionalidad: " + nacionalidad;
    }
    public static  PedidaCompleja pConCompleja(){
        String nombre = "";
        String apellidos = "";
        String nacionalidad = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = in.nextLine();
        System.out.println("Introduce tus apellidos: ");
        apellidos = in.nextLine();
        System.out.println("Introduce tu nacionalidad: ");
        nacionalidad = in.nextLine();

        // Creamos una nueva instancia de la clase pruebaArrayList con los datos ingresados
        PedidaCompleja persona = new PedidaCompleja(nombre, apellidos, nacionalidad);

        return persona;
    }
}
