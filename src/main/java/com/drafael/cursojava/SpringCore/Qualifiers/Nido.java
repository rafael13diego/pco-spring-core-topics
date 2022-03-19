package com.drafael.cursojava.SpringCore.Qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nido {

    @Autowired
    @Qualifier("pajaro")
    private Animal animal;

    private static final Logger log = LoggerFactory.getLogger(Nido.class);


    public void imprimir(){
        log.info("Info animal: "+animal.getNombre());
    }

}
