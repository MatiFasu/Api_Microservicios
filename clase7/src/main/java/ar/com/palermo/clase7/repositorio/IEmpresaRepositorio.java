package ar.com.palermo.clase7.repositorio;

import ar.com.palermo.clase7.entidad.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepositorio extends CrudRepository<Empresa, Long> {
}
