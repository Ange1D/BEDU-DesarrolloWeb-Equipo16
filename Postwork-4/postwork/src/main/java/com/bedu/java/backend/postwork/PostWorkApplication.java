package com.bedu.java.backend.postwork;

import com.bedu.java.backend.postwork.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

@SpringBootApplication
public class PostWorkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PostWorkApplication.class, args);
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
