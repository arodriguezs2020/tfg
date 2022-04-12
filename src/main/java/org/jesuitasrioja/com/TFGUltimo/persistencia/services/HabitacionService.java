package org.jesuitasrioja.com.TFGUltimo.persistencia.services;

import java.util.Date;
import java.util.List;

import org.jesuitasrioja.com.TFGUltimo.modelo.habitacion.Habitacion;
import org.jesuitasrioja.com.TFGUltimo.persistencia.repositories.HabitacionRepository;
import org.springframework.stereotype.Service;

@Service
public class HabitacionService extends BaseService<Habitacion, Integer, HabitacionRepository>{
//	public List<Habitacion> encontrarHabitacionesDisponibles(Date fechaEntrada, Date fechaSalida) {
//		return this.repositorio.encontrarHabitacionesDisponibles(fechaEntrada, fechaSalida);
//	}
}
