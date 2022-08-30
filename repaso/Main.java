package ctd.b3.java.repaso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("beto","espacio","AA11");
        System.out.println(capitan1);
        Velero barquinio1 = new Velero(100000, 200, LocalDate.parse("1999-01-01"),20.1,5);
        System.out.println(barquinio1);
        Yate barcote1 = new Yate(20000,20000,LocalDate.parse("2022-08-07"),200.0,100);
        Yate barcote2 = new Yate(200000,2000,LocalDate.parse("2018-08-07"),200.0,110);
        System.out.println("Soy un velero grande: "+barquinio1.soyUnVeleroGrande());
        System.out.println(barcote1);
        System.out.println(barcote2);
        System.out.println(barcote1.compareTo(barcote2));



    }


}
