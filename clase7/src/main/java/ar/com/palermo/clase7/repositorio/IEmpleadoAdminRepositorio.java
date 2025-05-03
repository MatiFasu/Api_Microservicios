package ar.com.palermo.clase7.repositorio;

import ar.com.palermo.clase7.entidad.EmpleadoAdmin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoAdminRepositorio extends CrudRepository<EmpleadoAdmin, Long> {
}
