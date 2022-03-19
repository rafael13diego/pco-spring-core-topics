package com.drafael.cursojava.SpringCore.Inyection.Atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {
    
    
    private String marca;
    
    private Integer modelo;
    

    public Motor(@Value("XL1") String marca,  @Value("1980")Integer modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
    }

    
    

}
