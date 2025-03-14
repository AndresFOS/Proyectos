
package com.mycompany.relaciones;

import java.util.List;

public class Auto {
    //Atributos del objeto
    private Long id;
    private String marca;
    private String modelo;
    
    //Creo una lista de propietarios(Un auto puede tener muchos propietarios)
    private List<Propietario> listaPropietarios;
    
    //Constructores
    public Auto(){
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios + '}';
    }
    
     //Getters y Setters
    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }
    
    public void setListaPropietarios(List<Propietario> listaPropietarios) {    
        this.listaPropietarios = listaPropietarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
