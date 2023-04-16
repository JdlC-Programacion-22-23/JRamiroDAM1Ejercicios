package programacion.Productos;

public class productosFrescos extends Productos{
    String pOrigenFresco;
    int fEnvasadoFresco;

    public productosFrescos(String nombre, int fechaCaducidad, int numeroLote){
        super(nombre, fechaCaducidad, numeroLote);
    }

    public void DatosExtendidos(int fechaEnvasado, String paisOrigen) {
        this.fEnvasadoFresco = fechaEnvasado;
        this.pOrigenFresco = paisOrigen;
    }
    public boolean EntradasCorrectas(){
        if (nombre.isEmpty()) return false;
        else if (fechaCaducidad!=0)return false;
        else if(fEnvasadoFresco!=0)return false;
        else if (numeroLote<minLote && numeroLote>maxLote) return false;
        else if(fEnvasadoFresco>fechaCaducidad)return false;
        else return true;
    }

    @Override
    public String toString() {
        return super.toString()+"fecha de envasado: "+ fEnvasadoFresco+ " "+"Pais Origen: "
        +pOrigenFresco;
    }
}
