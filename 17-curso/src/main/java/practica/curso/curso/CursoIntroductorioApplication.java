package practica.curso.curso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoIntroductorioApplication {

 /* private static Logger loguer = LoggerFactory.getLogger(CursoIntroductorioApplication.class) ; */

	public static Logger logger = LoggerFactory.getLogger(CursoIntroductorioApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(CursoIntroductorioApplication.class, args);
		logger.debug("DEBUG");

	}

}
