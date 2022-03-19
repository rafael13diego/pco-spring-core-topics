package com.drafael.cursojava.SpringCore.Qualifiers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pajaro extends Animal implements Volador{

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("18")Integer edad, @Value("Zeus") String nombre) {
        super(edad, nombre);
    }

    @Override
    public void volar() {
        log.info("Soy un pajaro y Estoy volando");
    }
}
