package ctd.b3.java.repaso;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Yate extends  Embarcacion implements Comparable{
    private int cantidadCamarotes;

    public Yate(double precioBase, double valorAdicional, LocalDate anioFabricacion, double eslora, int cantidadCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }


    @Override
    public int compareTo(@NotNull Object o) {
        int resultado=0;
        Yate yateAuxiliar = (Yate) o;
        if (cantidadCamarotes > yateAuxiliar.cantidadCamarotes)
            resultado=1;
        else if (cantidadCamarotes < yateAuxiliar.cantidadCamarotes)
            resultado=-1;
        return resultado;
    }

    @Override
    public String toString() {
        return "Soy un Yate" + '\n' +
                super.toString() + '\n' +
                "cantidadCamarotes=" + cantidadCamarotes;

    }
}
