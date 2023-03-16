package org.bedu.java.backend;

import org.bedu.java.backend.model.Persona;
import org.bedu.java.backend.service.FormatoTelefonoService;
import org.bedu.java.backend.service.ValidadorTelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PostworkApplication implements CommandLineRunner {
	private final ValidadorTelefonoService validadorTelefonoService;
	private final FormatoTelefonoService formatoTelefonoService;

	@Autowired
	public PostworkApplication(ValidadorTelefonoService validadorTelefonoService, FormatoTelefonoService formatoTelefonoService){
		this.validadorTelefonoService = validadorTelefonoService;
		this.formatoTelefonoService = formatoTelefonoService;
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


		while (!validadorTelefonoService.validarTelefono(numeroTelefonico)){
			System.out.print("Ha ocurrido un error con tu número de teléfono... introducelo nuevamente: ");
			numeroTelefonico = leer.nextLine();
		}

		numeroTelefonico = formatoTelefonoService.formatoNumero(numeroTelefonico);
		Persona persona = new Persona(nombre, numeroTelefonico);
		System.out.println(persona);
	}
}