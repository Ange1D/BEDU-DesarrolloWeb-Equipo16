package org.bedu.java.backend.sesion5;

import org.bedu.java.backend.sesion5.model.Persona;
import org.bedu.java.backend.sesion5.util.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PostworkApplication implements CommandLineRunner {
	private final Telefono telefono;
	@Autowired
	public PostworkApplication(Telefono telefono){
		this.telefono = telefono;
	}
	public static void main(String[] args) {
		SpringApplication.run(PostworkApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner leer = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		String nombre = leer.nextLine();

		System.out.print("Introduce tu número de teléfono: ");
		String numeroTelefonico = leer.nextLine();

		while (!telefono.getValidacion(numeroTelefonico)){
			System.out.print("Ha ocurrido un error con tu número de teléfono... introducelo nuevamente: ");
			numeroTelefonico = leer.nextLine();
		}

		numeroTelefonico = telefono.getTelefonoValidado(numeroTelefonico);
		Persona persona = new Persona(nombre, numeroTelefonico);
		System.out.println(persona);

	}
}
