package org.jesuitasrioja.com.TFGUltimo.modelo.habitacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionDTO {

	private Integer id;
	private String nombre;
	private String descripcion;
	private Integer precio;
	private String photo;
	private String tipo;
	private Integer huespedes;
	
}
