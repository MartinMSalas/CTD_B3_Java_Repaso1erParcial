package CTD_B3_Java_Practicas;

import java.time.LocalDate;

public abstract class Monopatin {

    private Tecnico tecnico;
    private LocalDate fechaEntrada;
    private LocalDate fechaInicio;
    private LocalDate fechaReparacion;
    private LocalDate fechaSalida;

    private String estadoReparacion;

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstadoReparacion() {
        return estadoReparacion;
    }

    public void setEstadoReparacion(String estadoReparacion) {
        this.estadoReparacion = estadoReparacion;
    }

    public boolean reparadoEnFecha(){
/*
        boolean isBefore = today.isBefore(pastDate);	//false

        boolean isAfter = today.isAfter(pastDate);
  */
        System.out.println("Estado de reparacion: "+this.estadoReparacion);
        return !fechaSalida.isAfter(fechaReparacion) && estadoReparacion.equals("Reparado");
    }
}
