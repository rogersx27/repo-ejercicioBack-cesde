package org.example.helpers.validaciones;

import org.example.helpers.mensajes.MensajesVehiculo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VehiculoValidacion {

    public boolean validarId(Integer id)throws Exception{

        if(id<0){
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }

        return true;
    }
    public boolean validarMarca(String marca)throws Exception{

        //VALIDAREMOS QUE UNA MARCA DE VAHICULO NO TENGA MAS 50 CARACTERES Y SOLO
        //TENGA LETRAS Y ESPACIOS

        //COMO VALIDAR UNA CADENA DE TEXTO CON JAVA

        //1. Se crea una expresion regular para validar el patron
        String expresionRegular="^[a-zA-Z\\s]*$";

        //2. Se debe crear un patron en el contexto de java
        //con al expresion regular generada
        Pattern patron=Pattern.compile(expresionRegular);

        //3. Debo comparar el patron de java con la cadena
        //de texto suministarda por el usuario
        Matcher coincidencia=patron.matcher(marca);


        //4.  Pregunto si hubo o no coincidencia
        if(!coincidencia.matches()){
            //NO hubo coincidencia
           throw new Exception("error en el formato del nombre de la marca");
        }

        if(marca.length()>50){
            throw new Exception("error en el tamaño de caracteres de la marca");
        }

        return true;

    }
    public boolean validarModelo(String fechaModelo)throws Exception{return true;}

}
