package ar.com.palermo.clase7.servicio;

import ar.com.palermo.clase7.entidad.Empresa;

import java.util.List;

public interface IEmpresaServicio {

    List<Empresa> obtenerEmpresas();

    Empresa obtenerEmpresa(Long id_empresa);

    void eliminarEmpresa(Long id_empresa);

    void editarEmpresa(Empresa e);

    void guardarEmpresa(Empresa e);

}
