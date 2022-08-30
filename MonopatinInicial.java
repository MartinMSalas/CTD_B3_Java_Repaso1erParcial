package CTD_B3_Java_Practicas;

public class MonopatinInicial extends Monopatin{
    private String estadoReparacion="En espera";

    public String getEstadoReparacion() {
        return estadoReparacion;
    }

    public void setEstadoReparacion(String estadoReparacion) {
        this.estadoReparacion = estadoReparacion;
    }

    @Override
    public boolean reparadoEnFecha() {
        System.out.println("Estado de reparacion: "+this.estadoReparacion);
        return !getFechaSalida().isAfter(getFechaReparacion())&& estadoReparacion.equals("Reparado");

    }

    public boolean estoyEnEspera(){

        return estadoReparacion.equals("En espera");
    }
}
