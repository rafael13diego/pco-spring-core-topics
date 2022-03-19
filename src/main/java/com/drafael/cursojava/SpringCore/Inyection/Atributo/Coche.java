package com.drafael.cursojava.SpringCore.Inyection.Atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {

    
    private String marca;
    
    private String modelo;
    
    private Motor motor;
    
    @Autowired
    public Coche( @Value("VW")String marca, @Value("TESLA")String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
    }

    

    
    
}
