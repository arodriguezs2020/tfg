package org.jesuitasrioja.com.TFGUltimo.persistencia.repositories;

import org.jesuitasrioja.com.TFGUltimo.modelo.reserva.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
