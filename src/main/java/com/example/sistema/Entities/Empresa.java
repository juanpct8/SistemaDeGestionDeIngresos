package com.example.sistema.Entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false,unique = true)
    private int id;
    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Column(name = "direccion",nullable = false)
    private String direccion;
    @Column(name = "telefono",nullable = false)
    private String telefono;
    @Column(name = "nit",nullable = false)
    private String nit;
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Empleado> empleados = new ArrayList<>();
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MovimientoDinero> movimientos = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<MovimientoDinero> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<MovimientoDinero> movimientos) {
        this.movimientos = movimientos;
    }
}
