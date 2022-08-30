package ctd.b3.java.repaso;

public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    @Override
    public String toString() {
        return "Soy un Capitan" + '\n' +
                "nombre= " + nombre + '\n' +
                "apellido= " + apellido + '\n' +
                "matriculaNavegacion= " + matriculaNavegacion;

    }
}
