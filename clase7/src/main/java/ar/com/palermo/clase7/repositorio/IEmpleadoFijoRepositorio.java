package ar.com.palermo.clase7.repositorio;

import ar.com.palermo.clase7.entidad.EmpleadoFijo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoFijoRepositorio extends CrudRepository<EmpleadoFijo, Long> {
}
