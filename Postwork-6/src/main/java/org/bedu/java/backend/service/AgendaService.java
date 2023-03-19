package org.bedu.java.backend.service;

import org.bedu.java.backend.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AgendaService {
    private final ValidadorTelefonoService validadorTelefonoService;
    private final AgendaMemoryDao agendaMemoryDao;

    @Autowired
    public AgendaService(ValidadorTelefonoService validadorTelefonoService, AgendaMemoryDao agendaMemoryDao){
        this.validadorTelefonoService = validadorTelefonoService;
        this.agendaMemoryDao = agendaMemoryDao;
    }

    public Persona guardarPersona(Persona persona){
        if(!validadorTelefonoService.validarTelefono(persona.getTelefono())){
            return null;
        }

        String telefono = validadorTelefonoService.limpiarTelefono(persona.getTelefono());
        persona.setTelefono(telefono);
        return agendaMemoryDao.guardarPersona(persona);
    }
    public Set<Persona> getPersonas(){
        return agendaMemoryDao.getPersonas();
    }
}
