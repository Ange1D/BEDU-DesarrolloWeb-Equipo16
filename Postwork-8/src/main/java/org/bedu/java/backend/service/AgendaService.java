package org.bedu.java.backend.service;

import org.bedu.java.backend.model.Persona;

import java.util.List;

public interface AgendaService {

   Persona savePersona( Persona persona );

   List<Persona> findAllPersona();

}
