package com.Coders.Sprint3.Controlador;


import com.Coders.Sprint3.Entidades.Empleado;
import com.Coders.Sprint3.Servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class EmpleadoControlador {

    @Autowired
    EmpleadoServicio empleadoServicio;


    //muestra los empleados creados
    @GetMapping({"/ver_empleados"})
    private String verEmpleado(Model model) {
        model.addAttribute("empleados", empleadoServicio.verEmpleado());
        return "ver_empleado";
    }

    //Crea los empleados
    @PostMapping({"/"})
    public RedirectView crearEmpleado(@ModelAttribute Empleado empleado, Model model) {
        model.addAttribute(empleado);
        this.empleadoServicio.crearEmpleado(empleado);
        return new RedirectView("/");
    }

    //Elimina a los empleados por su id
    @DeleteMapping({"/borrar/{id}"})
    public RedirectView eliminarEmpleado(@PathVariable Integer id){
        empleadoServicio.deleteEmpleado(id);
        return new RedirectView("/");
    }

    //muestra al el empleado por su id
    @GetMapping("/user/{id}")
    public Empleado consultarEmpleado(@PathVariable("id") Integer id) {
        Optional<Empleado> consultarEmpleado = empleadoServicio.consultarEmpleado(id);
        return consultarEmpleado.isEmpty() ? new Empleado() : consultarEmpleado.get();
    }

    //actualiza los datos del empleado por su id
    @PatchMapping("/user/{id}")
    public Empleado actualizarEmpleado(@PathVariable("id") Integer id, @RequestBody Empleado editarEmpleado) {
        return empleadoServicio.actualizarEmpleado(id, editarEmpleado);
    }

    @GetMapping({"/usuario"})
    public String formularioNuevoEmpleado(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "crear_usuario";
    }


}
