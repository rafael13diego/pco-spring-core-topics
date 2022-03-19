package com.drafael.cursojava.SpringCore.Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnviroment implements EnviromentService{
    @Override
    public String getEnviroment() {
        return "DEV";
    }
}
