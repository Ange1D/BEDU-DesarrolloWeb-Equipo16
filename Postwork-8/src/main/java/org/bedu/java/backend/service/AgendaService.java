package org.bedu.java.backend.service;

import org.bedu.java.backend.model.Persona;
import org.bedu.java.backend.persistence.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {
    private final ValidadorTelefonoService validadorTelefonoService;
    private final AgendaRepository agendaRepository;

    private final FormatoTelefonoService formatoTelefonoService;
    @Autowired
    public AgendaService(
       ValidadorTelefonoService validadorTelefonoService,
       AgendaRepository agendaRepository,
       FormatoTelefonoService formatoTelefonoService
    ){
        this.validadorTelefonoService = validadorTelefonoService;
        this.agendaRepository = agendaRepository;
        this.formatoTelefonoService = formatoTelefonoService;
    }

    public Persona guardaPersona(Persona persona){

        if(!validadorTelefonoService.validarTelefono(persona.getTelefono())){
            return null;
        }

        persona.setTelefono( formatoTelefonoService.formatoNumero( persona.getTelefono() ) );

        return agendaRepository.save( persona );
    }
    public List<Persona> getPersonas(){
        return agendaRepository.findAll();
    }
}
