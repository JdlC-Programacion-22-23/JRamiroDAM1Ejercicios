import programacion.Productos.*;
import java.util.Date;
import java.util.Scanner;
public class testHerencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opciones="";
        do{
            System.out.println("----------Menu-----------");
            System.out.println("Elige el producto a añadir");
            System.out.println("1. Productos frescos");
            System.out.println("2) Productos refrigerados");
            System.out.println("3) Productos Congelados");
            opciones=entrada.nextLine();
            switch(opciones){
                case "1":
                    //Productos.productosFrescos();
                break;
                case "2":
                //Productos.productosRefrigerados();
                break;
                case "3":
                //Productos.productosCongelados();
                break;
                default :
                System.out.println("Opcion no valida");
            }
            System.out.println("Quieres Seguir?");
            opciones=entrada.nextLine();
        }while(opciones.equalsIgnoreCase("si"));
    }   
}
