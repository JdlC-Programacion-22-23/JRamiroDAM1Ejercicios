package programacion.productos;

public class productosRefrigerados extends Producto{
    int fEnvasadoRefrigerado=0;
    String pOrigen="";
    public productosRefrigerados(String nombre, int fechaCaducidad, int numeroLote) {
        super(nombre, fechaCaducidad, numeroLote);
    }

    public void DatosExtendidos(int fechaEnvasado, String paisOrigen) {
        this.fEnvasadoRefrigerado=fechaEnvasado;
        this.pOrigen=paisOrigen;
    }

    public boolean EntradasCorrectas(){
        if (nombre.isEmpty()) return false;
        else if (fechaCaducidad!=0)return false;
        else if(fEnvasadoRefrigerado!=0)return false;
        else if (numeroLote<minLote && numeroLote>maxLote) return false;
        else if(fEnvasadoRefrigerado>fechaCaducidad)return false;
        else return true;
    }
    
}