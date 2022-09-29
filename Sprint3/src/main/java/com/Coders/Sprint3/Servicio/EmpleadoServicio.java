package com.Coders.Sprint3.Servicio;

import com.Coders.Sprint3.Entidades.Empleado;
import com.Coders.Sprint3.Repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicio {

    @Autowired
    EmpleadoRepositorio empleadoRepositorio;

    //crea un empleado
    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    //muestra todos los empleados
    public List<Empleado> verEmpleado() {
      return empleadoRepositorio.findAll();
    }

    //elimina a un empleado por su id
    public Empleado eliminarEmpleado(Empleado empleado, Integer id) {
        return empleadoRepositorio.deleteById(empleado);
    }

    //consuita a un empleado por su id
    public Optional<Empleado> consultarEmpleado(Integer id) {
        return empleadoRepositorio.findById(id);
    }

    //actualiza empleado por su id
    public Empleado actualizarEmpleado(Integer id, Empleado editarEmpleado) {
        Empleado pathEmplado;
        Optional<Empleado> actualEmpleado = empleadoRepositorio.findById(id);
        if (actualEmpleado.isPresent()) {
            pathEmplado = actualEmpleado.get();
            pathEmplado.setNombre(editarEmpleado.getNombre());
            pathEmplado.setEmail(editarEmpleado.getEmail());
            pathEmplado.setEmpresaVinculada(editarEmpleado.getEmpresaVinculada());
            pathEmplado.setRolEmpleado(editarEmpleado.getRolEmpleado());
        } else {
            pathEmplado = editarEmpleado;
        }
        return empleadoRepositorio.save(pathEmplado);
    }
    public boolean deleteEmpleado(Integer id){
        try{
            empleadoRepositorio.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
