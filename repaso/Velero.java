package ctd.b3.java.repaso;

import java.time.LocalDate;

public class Velero extends  Embarcacion{
    private int cantidadMastiles;

    public Velero(double precioBase, double valorAdicional, LocalDate anioFabricacion, double eslora, int cantidadMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean soyUnVeleroGrande(){
        return (cantidadMastiles>4);
    }

    @Override
    public String toString() {
        return "Soy un Velero" + '\n' +
                super.toString() + '\n' +
                "cantidadMastiles=" + cantidadMastiles;
    }
}
