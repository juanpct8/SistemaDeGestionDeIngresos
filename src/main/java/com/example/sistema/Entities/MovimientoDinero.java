package com.example.sistema.Entities;

import javax.persistence.*;

@Entity
@Table(name="MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false,unique = true)
    private int id;
    @Column(name = "monto",nullable = false)
    private float monto;
    @Column(name = "conceptoMovimiento",nullable = false)
    private String conceptoMovimiento;
    @Column(name = "nombreQuienModifico",nullable = false)
    private String nombreQuienModifico;
    @ManyToOne
    @JoinColumn(name="movimiento_id", nullable=false)
    private Empresa empresa;
    @ManyToOne
    @JoinColumn(name="movimiento_empleado_id", nullable=false)
    private Empleado empleado;


    public MovimientoDinero(){}
    public MovimientoDinero(float monto, String conceptoMovimiento, String nombreQuienModifico) {
        this.monto = monto;
        this.conceptoMovimiento = conceptoMovimiento;
        this.nombreQuienModifico = nombreQuienModifico;
    }

    public float getMonto() {
        return monto;
    }
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getNombreQuienModifico() {
        return nombreQuienModifico;
    }

    public void setNombreQuienModifico(String nombreQuienModifico) {
        this.nombreQuienModifico = nombreQuienModifico;
    }
}
