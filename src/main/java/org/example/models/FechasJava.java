package org.example.modelos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechasJava {

    public void probarFechas(){

        //TRABAJNDO CON FECHAS EN JAVA

        //1. Configurar fecha desde el usuario
        int anio=1985;
        int mes=9;
        int dia=15;
        LocalDate fechaUsuario=LocalDate.of(anio,mes,dia);
        System.out.println("La fecha ingresada por el usuario es: "+fechaUsuario);

        //2. Configurar fecha desde el sistema
        LocalDate fechaSistema=LocalDate.now();
        System.out.println("La fecha ingresada por el sistema es: "+fechaSistema);



        //OPERACIONES COMUNES CON FECHAS EN UN SERVIDOR
        // Calcular la diferencia entre dos fechas
        Long diferenciaDias= ChronoUnit.DAYS.between(fechaUsuario,fechaSistema);
        Long diferenciaMeses= ChronoUnit.MONTHS.between(fechaUsuario,fechaSistema);
        Long diferenciaAnios= ChronoUnit.YEARS.between(fechaUsuario,fechaSistema);

        System.out.println("Han pasado "+diferenciaDias+ " Dias, desde que naciste");
        System.out.println("Han pasado "+diferenciaMeses+ " meses, desde que naciste");
        System.out.println("Han pasado "+diferenciaAnios+ " años, desde que naciste");

        //agregar o restarle dias/meses etc a una fecha
        DayOfWeek diaSemana=fechaSistema.getDayOfWeek(); //obteniendo el dia de una fecha
        LocalDate fechaActualizada=fechaSistema.plusDays(5); //agregando dias a una fecha
        System.out.println("la fecha es: "+fechaSistema);
        System.out.println("el dia es: "+diaSemana);

        System.out.println("la fecha actualizada es: "+fechaActualizada);
        System.out.println("el dia es: "+fechaActualizada.getDayOfWeek());

        //obteniendo datos de una fecha
        DayOfWeek diaSemanaFecha= fechaSistema.getDayOfWeek();
        int diaMes=fechaSistema.getDayOfMonth();
        int diaAnio=fechaSistema.getDayOfYear();

        System.out.println(fechaSistema);
        System.out.println(diaSemanaFecha);
        System.out.println(diaMes);
        System.out.println(diaAnio);


        //Cambiar formato de una fecha
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada=fechaSistema.format(formato);

        System.out.println(fechaSistema);
        System.out.println(fechaFormateada);




    }

}
