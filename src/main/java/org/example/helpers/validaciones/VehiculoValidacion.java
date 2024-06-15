package org.example.helpers.validaciones;

import org.example.helpers.mensajes.MensajesVehiculo;

public class VehiculoValidacion {

    public boolean validarId(Integer id)throws Exception{

        if(id<0){
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }

        return true;
    }
    public boolean validarMarca(String marca)throws Exception{return true;}
    public boolean validarModelo(String fechaModelo)throws Exception{return true;}

}
