package CTD_B3_Java_Practicas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MonopatinInicial mono1 = new MonopatinInicial();
        System.out.println(mono1.estoyEnEspera());
        mono1.setEstadoReparacion("Reparado");
        System.out.println(mono1.estoyEnEspera());

        System.out.println("Ahora probamos el profesional");
        MonopatinProfesional monoP1 = new MonopatinProfesional();
        MonopatinProfesional monoP2 = new MonopatinProfesional();

        monoP1.setCantidadReparaciones(7);
        monoP2.setCantidadReparaciones(10);
        System.out.println(monoP2.esMayor(monoP1));
        System.out.println("Ahora probamos cargar las fechas ");

        mono1.setFechaReparacion(LocalDate.parse("2016-08-16"));
        mono1.setFechaSalida(LocalDate.parse("2016-08-14"));
        mono1.setEstadoReparacion("Reparado");
        System.out.println(mono1.getEstadoReparacion());
        System.out.println(mono1.reparadoEnFecha());




    }
}
