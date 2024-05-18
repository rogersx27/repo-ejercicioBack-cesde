package org.example;

import org.example.modelos.Vehiculo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //DENTRO DEL MAIN USO LAS CLASES DEL PROGRAMA

        //COMO SE USA UNA CLASE?
        //(USAR LA CLASE ES ASIGNARLE VALORES A SUS ATRIBUTOS)
        //(USAR LA CLASE ES LLAMAR SUS METODOS)

        //PARA USAR UNA CLASE DEBO CREAR UN OBJETO

        //QUE ES UN OBJETO?
        //UN OBJETO ES UNA VARIABLES PERO ESPECIAL
        Integer edad=34;
        Vehiculo objeto=new Vehiculo();
        Vehiculo objetoDos=new Vehiculo(5,"volvo", LocalDate.now(),2500.5,"blanco","volvo de ultima generacion","automovil",800,255.0,100);

        //mostrando uno de los atributos del objeto
        System.out.println("la marca del objeto 1 es: "+objeto);
        System.out.println("la marca del objeto 2 es: "+objetoDos);

        //creando un objeto de la clase Prueba

        Prueba objetoTres = new Prueba();
        System.out.println("la marca del objeto 3 es:"+objetoTres);

    }
}