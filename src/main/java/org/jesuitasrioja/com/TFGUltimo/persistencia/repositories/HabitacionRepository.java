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
	@Query(value = "select h from Habitacion h where not exists (select null from Reserva r where :fecha1 <= r.entrada and :fecha2 >= r.salida)")
	List<Habitacion> encontrarHabitacionesDisponibles(@Param("fecha1")Date fechaInicio,@Param("fecha2") Date fechaFin);
}
