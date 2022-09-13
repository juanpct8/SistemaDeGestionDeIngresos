package com.example.sistema.Entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false,unique = true)
    private int id;
    @Column(name = "nombreEmpelado",nullable = false)
    private String nombreEmpelado;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "empresaPertenece",nullable = false)
    private String empresaPertenece;
    @Column(name = "rol",nullable = false)
    private String rol;
    @ManyToOne
    @JoinColumn(name="emplado_id", nullable=false)
    private Empresa empresa;
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MovimientoDinero> movimientos = new ArrayList<>();

    public Empleado(){}

    public Empleado(String nombreEmpelado, String email, String empresaPertenece, String rol) {
        this.nombreEmpelado = nombreEmpelado;
        this.email = email;
        this.empresaPertenece = empresaPertenece;
        this.rol = rol;
    }
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
    public String getNombreEmpelado() {
        return nombreEmpelado;
    }

    public void setNombreEmpelado(String nombreEmpelado) {
        this.nombreEmpelado = nombreEmpelado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(String empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
