package com.bedu.java.backend.postwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Telefono {
    private final ValidadorTelefono validadorTelefono;
    private final FormatoTelefonoService formatoTelefonoService;
    private String telefono;

    @Autowired
    public Telefono(ValidarTelefonoService validarTelefono, FormatoTelefonoService formatoTelefonoService) {
        this.validarTelefonoService = validarTelefono;
        this.formatoTelefonoService = formatoTelefonoService;
    }


    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String getTelefono(){
        return this.telefono;
    }

    public boolean getValidacion(String telefono) {
        return validarTelefono.validarTelefono(telefono);
    }

    public String getTelefonoValidado(String telefono){
        setTelefono(telefono);
        return formatoTelefonoService.formatoNumero(this.getTelefono());
    }
}
