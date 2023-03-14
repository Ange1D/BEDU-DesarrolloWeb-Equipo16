package org.bedu.java.backend.sesion4;

import org.bedu.java.backend.sesion4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

@SpringBootApplication
public class Sesion4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sesion4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nonmbre = reader.nextLine();

		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();

		Persona persona = new Persona(nonmbre, telefono);
		System.out.println(persona);
	}

}
