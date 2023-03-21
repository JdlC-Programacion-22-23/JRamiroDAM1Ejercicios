import programacion.negocios.Pizzeria.cliente;
public class MainPizzeria{
    public static void main(String[] args){
        System.out.println("-------Pizzeria-------");
        System.out.println("Para comenzar, Te crearemos un nuevo cliente:");
        System.out.println("Primero, pon tu nombre:");
        cliente Cliente=new cliente(null, null, null, 0);
        Cliente.getNombre();
    }
}