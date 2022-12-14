package com.cuevasdeayllon.repository;

import java.util.List;

import com.cuevasdeayllon.entity.Propuestas;

public interface PropuestaRepository {
	
	void save(Propuestas porpuesta);
	List<Propuestas> findAll();
	
	void deleteById(Propuestas propuesta,int id);
	
	Propuestas findByIdPropuesta(int idPropuesta);
	
	Propuestas findBtNombre(String nombre);
	


}
