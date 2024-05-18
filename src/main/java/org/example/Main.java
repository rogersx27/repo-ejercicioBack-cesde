package org.example;

import org.example.modelos.Vehiculo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Vehiculo vehiculo = new Vehiculo();



        //llamemos a pipe (SET)
        vehiculo.setMarca("mazda");
        vehiculo.setAutonomia(-300);


        System.out.println("el nombre del vehiculo 1: "+vehiculo.getMarca());
        System.out.println("la autonomia es: "+vehiculo.getAutonomia());

    }
}