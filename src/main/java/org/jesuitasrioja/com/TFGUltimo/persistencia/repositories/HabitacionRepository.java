package org.jesuitasrioja.com.TFGUltimo.persistencia.repositories;

import java.util.Date;
import java.util.List;

import org.jesuitasrioja.com.TFGUltimo.modelo.habitacion.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer>{
	@Query(value = "select h from Habitacion h where not exists (select r from Reserva r where r.habitacion.id = h.id and :entrada <= r.entrada and :salida >= r.salida)")
	List<Habitacion> encontrarHabitacionesDisponibles(@Param("entrada")Date fechaInicio,@Param("salida") Date fechaFin);
}
