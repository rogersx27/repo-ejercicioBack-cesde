package org.example.modelos;

import java.time.LocalDate;

public class Vehiculo {

    //id
    private Integer id;

    //marca
    private String marca;

    //modelo
    private LocalDate modelo;

    //kilometraje
    private Double kilometraje;

    //color
    private String color;

    //descripcion
    private String descripcion;

    //tipo
    private String tipo;

    //autonomia
    private Integer autonomia;

    //capacidadCarga
    private Double capacidadCarga;

    //avaluo
    private Integer avaluo;

    //CONSTRUCTORES DE LA CLASE


    public Vehiculo() {
    }

    public Vehiculo(Integer id, String marca, LocalDate modelo, Double kilometraje, String color, String descripcion, String tipo, Integer autonomia, Double capacidadCarga, Integer avaluo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.capacidadCarga = capacidadCarga;
        this.avaluo = avaluo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getModelo() {
        return modelo;
    }

    public void setModelo(LocalDate modelo) {
        this.modelo = modelo;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {

        if(autonomia<0){
            System.out.println("error en la autonomia ingresada");
        }else{
            this.autonomia = autonomia;
        }

    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        this.avaluo = avaluo;
    }
}
