package org.bedu.java.backend.persistence;

import org.bedu.java.backend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Persona, Long> {
}
