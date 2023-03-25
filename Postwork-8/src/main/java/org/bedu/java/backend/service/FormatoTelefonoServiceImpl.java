package org.bedu.java.backend.service;

import org.springframework.stereotype.Service;

@Service
public class FormatoTelefonoServiceImpl implements  FormatoTelefonoService {

   // Se agrega formato ##-####-#### al número de teléfono
   @Override
   public String formatoNumero(String telefono) {
      String numero = obtenerNumeros(telefono);
      return String.format("%s-%s-%s",
         numero.substring(0,2),
         numero.substring(2,6),
         numero.substring(6, 10));

   }

   // Elimina cualquier caractér que no sea número
   private String obtenerNumeros(String telefono){
      StringBuilder numero = new StringBuilder();
      for(char ch: telefono.toCharArray()){
         if(ch >= 48 && ch <= 57){
            numero.append(ch);
         }
      }
      return numero.toString();
   }

}
