package org.bedu.java.backend.service;

import org.bedu.java.backend.model.Persona;
import org.bedu.java.backend.persistence.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {

    private final ValidadorTelefonoService validadorTelefonoServiceImpl;
    private final AgendaRepository agendaRepository;
    private final FormatoTelefonoService formatoTelefonoServiceImpl;

    @Autowired
    public AgendaServiceImpl(
       ValidadorTelefonoService validadorTelefonoServiceImpl,
       FormatoTelefonoService formatoTelefonoServiceImpl,
       AgendaRepository agendaRepository
    ){
        this.validadorTelefonoServiceImpl = validadorTelefonoServiceImpl;
        this.formatoTelefonoServiceImpl = formatoTelefonoServiceImpl;
        this.agendaRepository = agendaRepository;
    }

    @Override
    public Persona savePersona(Persona persona){

        if(!validadorTelefonoServiceImpl.validarTelefono(persona.getTelefono())){
            return null;
        }

        persona.setTelefono( formatoTelefonoServiceImpl.formatoNumero( persona.getTelefono() ) );

        return agendaRepository.save( persona );
    }

    @Override
    public List<Persona> findAllPersona(){
        return agendaRepository.findAll();
    }
}
