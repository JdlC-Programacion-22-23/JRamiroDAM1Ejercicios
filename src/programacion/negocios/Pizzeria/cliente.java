package programacion.negocios.Pizzeria;
import java.util.Scanner;
public class cliente {
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private int numeroTelefono;
    public cliente(String Nombre,String Apellidos,String Direccion, int numeroTelefono){
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Direccion=Direccion;
        this.numeroTelefono=numeroTelefono;
    }
    public String getNombre(){
       Scanner in=new Scanner(System.in);
        do{
            System.out.println("Indica tu nombre, no puedes dejar este espacio vacio");
            Nombre=in.nextLine();
        }while(Nombre.length()==0);
        return Nombre;
    }
}
