package ctd.b3.java.repaso;

import java.time.LocalDate;

public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private LocalDate anioFabricacion;
    private double eslora;

    public Embarcacion(double precioBase, double valorAdicional, LocalDate anioFabricacion, double eslora) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;

    }

    public double montoDelAlquiler(){
        double resultado = precioBase;
        if (anioFabricacion.isAfter(LocalDate.parse("2020")))
            resultado += valorAdicional;
        return resultado;
    }

    @Override
    public String toString() {
        return "Soy una Embarcacion" + '\n' +
                "PrecioBase=" + " $ " + precioBase +  '\n' +
                "ValorAdicional=" + " $ " + valorAdicional + '\n' +
                "AnioFabricacion=" + anioFabricacion + '\n' +
                "Eslora=" + eslora;

    }
}
