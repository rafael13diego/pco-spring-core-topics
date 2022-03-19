package com.drafael.cursojava.SpringCore.Qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal{


    public Perro(@Value("15")Integer edad,@Value("Kratos") String nombre) {
        super(edad, nombre);
    }
}
