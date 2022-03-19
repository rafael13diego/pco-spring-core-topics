package com.drafael.cursojava;

import com.drafael.cursojava.SpringCore.Inyection.Atributo.Coche;

import com.drafael.cursojava.SpringCore.KEYS.KeyPro;
import com.drafael.cursojava.SpringCore.Perfiles.EnviromentService;
import com.drafael.cursojava.SpringCore.Qualifiers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CursojavaApplication {

	//KeyPro keyPro;

	private static final Logger log = LoggerFactory.getLogger(CursojavaApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CursojavaApplication.class, args);

		EnviromentService enviromentService = context.getBean(EnviromentService.class);
		log.info("Active: "+enviromentService.getEnviroment());

		/*KeyPro keyPro = new KeyPro();
		keyPro.genKeyPair();*/





	}

}
