package CTD_B3_Java_Practicas;

public class MonopatinProfesional extends  Monopatin implements Comparable{
    private int cantidadReparaciones;




    public int getCantidadReparaciones() {
        return cantidadReparaciones;
    }

    public void setCantidadReparaciones(int cantidadReparaciones) {
        this.cantidadReparaciones = cantidadReparaciones;
    }

    public boolean esMayor(MonopatinProfesional monopatin){

        return cantidadReparaciones > monopatin.cantidadReparaciones;
    }

    @Override
    public int compareTo(Object o) {
        //  1 0 -1
        int auxiliar;
        MonopatinProfesional mono = (MonopatinProfesional) o;
        if ((this.cantidadReparaciones) > mono.cantidadReparaciones){
            auxiliar =1;
        }else if ((this.cantidadReparaciones) == mono.cantidadReparaciones){
            auxiliar =0;
        }else{
            auxiliar= -1;
        }

        return auxiliar;
    }
}
