package programacion.negocios.Edificio;
import java.util.ArrayList;
import java.util.Scanner;
public class menu{
    public static void ValidacionMenu() {
        Scanner in=new Scanner(System.in);
        System.out.print("Para empezar cuantos años tienes: ");
        ArrayList<Integer>anioList=new ArrayList<Integer>();
        anioList.add(in.nextInt());
        /*Comprobacion de edad */
        /*Uso Arraylist para la practica de ArrayList y para futuras implementaciones de bucles*/
        if(anioList.get(0)<18){
            System.out.println("Lo sentimos, eres menor de edad para comprar una casa");
        }
        else{
            System.out.print("Dime tu nombre y apellidos: ");
            /*Nuevo ArrayList para guardar los nombres y apellidos de las personas */
            ArrayList<String>NombreApellidosList=new ArrayList<String>();
            /*Esto es para limpiar el buffer */
            in.nextLine();
            NombreApellidosList.add(in.nextLine());
            System.out.print("De acuerdo, entonces tu eres "+NombreApellidosList.get(0)+" "+"y tienes "+anioList.get(0));
            System.out.println(" ¿Es correcto?");
            String respuesta=in.nextLine();
            if (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")){
                System.out.println("YA puedes acceder a nuestros servicios");
                System.out.println("1) Comprar Casa");
                System.out.println("2) Vender Casa");
                System.out.println("3)Consultar casas");
                do{
                    System.out.println("Seleccione una de nuestras opciones");
                    int opcion=in.nextInt();
                    switch(opcion){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:
                            CreacionDeCasas.CrearCasas();
                        break;
                        default:
                        System.out.println("Te has equivocado de opcion");
                    }
                    System.out.println("¿Necesitas algo mas?");
                    in.nextLine();
                    respuesta=in.nextLine();
                }while(respuesta.equals("Si") || respuesta.equals("si"));
                System.out.println("Ya esta hecho, si necesita algo mas o le ha salido un error comuniquelo a staff");
            }
        }
    }
}