package programacion.Correo;
import java.util.Scanner;
public class correo {
    public correo(){
        String opcion="";
        Scanner in= new Scanner(System.in);
        do{
        System.out.println("Elige una de las opciones");
        System.out.println("1) Bandeja de Entrada");
        System.out.println("2) Añadir correo");
        System.out.println("3) Eliminar Correo");
        System.out.println("4) Mostrar un correo");
        System.out.println("5) Mostrar todos los correos");
        System.out.println("6) Mostrar correos a partir de su origen");
        System.out.println("7) salir");
        opcion=in.nextLine();
        }while(opcion.equalsIgnoreCase("si"));
    }
}
