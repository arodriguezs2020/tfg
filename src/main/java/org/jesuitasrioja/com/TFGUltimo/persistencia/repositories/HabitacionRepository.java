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
	@Query(value = "SELECT h FROM HABITACIONES h WHERE NOT EXISTS (SELECT null FROM RESERVA r WHERE r.habitacion = h.id AND :fecha2 <= r.entrada AND :fecha1 >= r.salida)",
			nativeQuery = true)
	List<Habitacion> encontrarHabitacionesDisponibles(@Param("fecha1")Date fechaInicio,@Param("fecha2") Date fechaFin);
}
