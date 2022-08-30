package CTD_B3_Java_Practicas;

public class Tecnico {
    private String nombre;
    private String apellido;
    private String dni;
    private int legajo;

    private double saldo;

    public Tecnico(String nombre, String apellido, String dni, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;

    }

    public Tecnico(String apellido, int legajo) {
        this.apellido = apellido;
        this.legajo = legajo;
    }
}
