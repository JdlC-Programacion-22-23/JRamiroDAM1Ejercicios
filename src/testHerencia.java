import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import programacion.productos.*;

public class testHerencia {
  public static void main(String[] args) {
    String nombre = "";
    String FechaCaducidad = "";
    String numeroLotes = "";
    String PaisOrigen = "";
    String fechaEnvasado = "";
    ArrayList<ProductoFresco> arrayProductosFrescos = new ArrayList<ProductoFresco>();
    ArrayList<ProductoFresco> arrayProductosRefrigerados = new ArrayList<ProductoFresco>();

    ProductoFresco productoFresco = new ProductoFresco();
    productoFresco.setDatos("lechuga", "2023-05-01", "12345");
    productoFresco.DatosExtendidos("2023-04-18", "ES");
    arrayProductosFrescos.add(productoFresco);
    productoFresco = new ProductoFresco();
    productoFresco.setDatos("tomate", "2023-06-01", "666345");
    productoFresco.DatosExtendidos("2023-03-18", "FR");
    arrayProductosFrescos.add(productoFresco);
    


    try (Scanner entrada = new Scanner(System.in)) {
      String opciones = "";
      do {

        System.out.println("Productos Frescos:");
        for (ProductoFresco producto : arrayProductosFrescos) {
          System.out.println(producto);
        }

        System.out.println("----------Menu-----------");
        System.out.println("Elige el producto a añadir");
        System.out.println("1. Registrar Productos frescos");
        System.out.println("2) Registrar Productos refrigerados");
        System.out.println("3) Registrar Productos Congelados");
        opciones = entrada.nextLine();
        switch (opciones) {
          case "1":
            System.out.println("Has elegido Un producto fresco");
            ProductoFresco productosfresquitos = new ProductoFresco();
            System.out.println("Pon el nombre del producto");
            nombre = entrada.nextLine();
            System.out.println("Pon la fecha de caducidad del producto");
            FechaCaducidad = entrada.nextLine();
            System.out.println("Pon el numero de lote");
            numeroLotes = entrada.nextLine();
            productosfresquitos.setDatos(nombre, FechaCaducidad, numeroLotes);
            System.out.println("Pon la fecha del envasado");
            fechaEnvasado = entrada.nextLine();
            System.out.println("Pon el Pais De origen");
            PaisOrigen = entrada.nextLine();
            productosfresquitos.DatosExtendidos(fechaEnvasado, PaisOrigen);

            arrayProductosFrescos.add(productosfresquitos);
            System.out.println(productosfresquitos);

            break;
          /*
           * case "2":
           * System.out.println("Has elegido Un producto Refrigerado");
           * productosRefrigerados productosRefrigeraditos = new
           * productosRefrigerados(nombre, FechaCaducidad,
           * numeroLotes);
           * System.out.println("Pon el nombre del producto");
           * nombre = entrada.nextLine();
           * System.out.println("Pon la fecha de caducidad del producto");
           * FechaCaducidad = entrada.nextInt();
           * System.out.println("Pon el numero de lote");
           * numeroLotes = entrada.nextInt();
           * productosRefrigeraditos.setDatos(nombre, FechaCaducidad, numeroLotes);
           * System.out.println("Pon la fecha del envasado");
           * fechaEnvasado = entrada.nextInt();
           * entrada.nextLine();
           * System.out.println("Pon el Pais De origen");
           * PaisOrigen = entrada.nextLine();
           * productosRefrigeraditos.DatosExtendidos(fechaEnvasado, PaisOrigen);
           * if (productosRefrigeraditos.EntradasCorrectas() == false) {
           * System.out.println("El producto no se ha registrado, "
           * + "vuelva a intentarlo");
           * break;
           * } else
           * System.out.println(productosRefrigeraditos);
           * break;
           * case "3":
           * System.out.println("Has elegido Un producto Congelado");
           * ArrayList<ProductoFresco> arrayProductosCongelado = new
           * ArrayList<ProductoFresco>();
           * break;
           */
          case "4":
            System.out.println("Guardando a disco...");
            FileWriter escritor = null;

            try {
              escritor = new FileWriter("ProductosFrescos.csv");
              for (int i = 0; i < arrayProductosFrescos.size(); i++) {
                if (i == 0) {
                  arrayProductosFrescos.get(i).escribirCabecera(escritor);
                }
                arrayProductosFrescos.get(i).escribirProducto(escritor);
              }
              escritor.close();
            } catch (Exception e) {
              System.out.println("EXCEPTION");
            }

          default:
            System.out.println("Opcion no valida");
        }
        System.out.println("Quieres Seguir?");
        opciones= entrada.nextLine();
      } while (opciones.equalsIgnoreCase("si"));
    }
  }
}
