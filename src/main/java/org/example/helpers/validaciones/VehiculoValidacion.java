package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidator;
import org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.mensajes.RegexExpresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VehiculoValidacion {

    //INYECTO AL DEPEDENCIA A LA LA CLASE REGEXVALIDATOR
    RegexValidator regexValidator= new RegexValidator();

    public boolean validarId(Integer id)throws Exception{

        if(id<0){
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }

        return true;
    }
    public boolean validarMarca(String marca)throws Exception{
        if(!regexValidator.validarRegex(marca, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
           throw new Exception("error en el formato del nombre de la marca");
        }
        if(marca.length()>50){
            throw new Exception("error en el tamaño de caracteres de la marca");
        }
        return true;

    }
    public boolean validarModelo(String fechaModelo)throws Exception{return true;}

}
