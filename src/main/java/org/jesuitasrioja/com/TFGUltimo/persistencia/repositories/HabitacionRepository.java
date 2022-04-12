package org.jesuitasrioja.com.TFGUltimo.persistencia.repositories;

import java.util.Date;
import java.util.List;

import org.jesuitasrioja.com.TFGUltimo.modelo.habitacion.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer>{
//	@Query(value = "SELECT h FROM Habitaciones h WHERE NOT EXISTS (SELECT null FROM Reserva r WHERE r.habitacion = h.id AND ?2 <= r.fechaEntrada AND ?1 >= r.fechaSalida)")
//	List<Habitacion> encontrarHabitacionesDisponibles(Date fechaInicio, Date fechaFin);
}
