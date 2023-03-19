package org.bedu.java.backend.controller;

import org.bedu.java.backend.model.Persona;
import org.bedu.java.backend.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/persona")
public class AgendaController {

   AgendaService agendaService;
   @Autowired
   AgendaController(
      AgendaService agendaService
   ) {
      this.agendaService = agendaService;
   }

   @PostMapping
   public ResponseEntity<Persona> guardaPersona(
      @RequestBody Persona persona
   ) {
      return new ResponseEntity<>( agendaService.guardaPersona(persona), HttpStatus.OK);
   }

   @GetMapping
   public ResponseEntity<Set<Persona>> getPersonas() {
      return ResponseEntity.ok( agendaService.getPersonas() );
   }
}
