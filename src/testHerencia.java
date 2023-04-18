import programacion.Productos.*;
import java.util.Scanner;

public class testHerencia {
    public static void main(String[] args) {
        String nombre = "";
        int FechaCaducidad = 0;
        int numeroLotes = 0;
        String PaisOrigen = "";
        int fechaEnvasado = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            String opciones = "";
            do {
                System.out.println("----------Menu-----------");
                System.out.println("Elige el producto a añadir");
                System.out.println("1) Registrar Productos frescos");
                System.out.println("2) Registrar Productos refrigerados");
                System.out.println("3) Registrar Productos Congelados");
                opciones = entrada.nextLine();
                switch (opciones) {
                    case "1":
                        System.out.println("Has elegido Un producto fresco");
                        productosFrescos productosfresquitos = new productosFrescos(nombre, FechaCaducidad,
                                numeroLotes);
                        System.out.println("Pon el nombre del producto");
                        nombre = entrada.nextLine();
                        System.out.println("Pon la fecha de caducidad del producto");
                        FechaCaducidad = entrada.nextInt();
                        System.out.println("Pon el numero de lote");
                        numeroLotes = entrada.nextInt();
                        entrada.nextLine();
                        productosfresquitos.setDatos(nombre, FechaCaducidad, numeroLotes);
                        System.out.println("Pon la fecha del envasado");
                        fechaEnvasado = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Pon el Pais De origen");
                        PaisOrigen = entrada.nextLine();
                        productosfresquitos.DatosExtendidos(fechaEnvasado, PaisOrigen);
                        if (productosfresquitos.EntradasCorrectas() == false) {
                            System.out.println("El producto no se ha registrado, "
                                    + "vuelva a intentarlo");
                            break;
                        }
                        System.out.println(productosfresquitos);
                        break;
                    case "2":
                        System.out.println("Has elegido Un producto Refrigerado");
                        productosRefrigerados productosRefrigeraditos = new productosRefrigerados(nombre,
                                FechaCaducidad, numeroLotes);
                        System.out.println("Pon el nombre del producto");
                        nombre = entrada.nextLine();
                        System.out.println("Pon la fecha de caducidad del producto");
                        FechaCaducidad = entrada.nextInt();
                        System.out.println("Pon el numero de lote");
                        numeroLotes = entrada.nextInt();
                        productosRefrigeraditos.setDatos(nombre, FechaCaducidad, numeroLotes);
                        System.out.println("Pon la fecha del envasado");
                        fechaEnvasado = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Pon el Pais De origen");
                        PaisOrigen = entrada.nextLine();
                        productosRefrigeraditos.DatosExtendidos(fechaEnvasado, PaisOrigen);
                        if (productosRefrigeraditos.EntradasCorrectas() == false) {
                            System.out.println("El producto no se ha registrado, "
                                    + "vuelva a intentarlo");
                            break;
                        } else
                            System.out.println(productosRefrigeraditos);
                        break;
                    case "3":
                        System.out.println("Has elegido Un producto Congelado");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
                System.out.println("Quieres Seguir?");
                entrada.nextLine();
            } while (opciones.equalsIgnoreCase("si"));
        }
    }
}
