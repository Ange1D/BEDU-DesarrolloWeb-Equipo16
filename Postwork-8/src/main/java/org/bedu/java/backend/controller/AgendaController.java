package org.bedu.java.backend.controller;

import org.bedu.java.backend.model.Persona;
import org.bedu.java.backend.service.AgendaService;
import org.bedu.java.backend.service.AgendaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class AgendaController {
   private final AgendaService agendaServiceImpl;
   @Autowired
   AgendaController(
      AgendaService agendaServiceImpl
   ) {
      this.agendaServiceImpl = agendaServiceImpl;
   }

   @PostMapping(value = "/persona/save")
   public ModelAndView savePersona(
      @Valid Persona persona,
      Errors errors
   ) {

      ModelAndView mav;

      if( errors.hasErrors() ){
            mav = new ModelAndView("addPersona" );
      }
      else {
         agendaServiceImpl.savePersona(persona);
         mav = new ModelAndView("redirect:/persona/all" );
      }

      return mav;
   }

   @GetMapping("/persona/add")
   public ModelAndView addPersona() {

      ModelAndView mav = new ModelAndView("addPersona");
      Persona persona = new Persona();
      mav.addObject("persona", persona );

      return mav;
   }

   @GetMapping("/persona/all")
   public ModelAndView allPersona() {

      ModelAndView mav = new ModelAndView("allPersona" );
         mav.addObject("personas", agendaServiceImpl.findAllPersona() );

      return mav;
   }

}
