package ob.obspringejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ObSpringEjercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringEjercicio3Application.class, args);
		EstudiantesRepository repository = context.getBean(EstudiantesRepository.class);
		System.out.println("El numero inicial de estudiantes es: " + repository.count());
		Estudiantes estudiante1 = new Estudiantes(null,"Luis", "Martinez", "Fisica");
		repository.save(estudiante1);

		Estudiantes estudiante3 = context.getBean(Estudiantes.class);
		repository.save(estudiante3);

		//utilizando beans.xml
		ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
		Estudiantes estudiante2 = context2.getBean(Estudiantes.class);
		repository.save(estudiante2);



		System.out.println("El numero actual de estudiantes es: " + repository.count());

		System.out.println(repository.findAll());
	}

}
