package com.example.sistema.entities;

public class MovimientoDinero {
    private float monto;
    private String conceptoMovimiento;
    private String nombreQuienModifico;

    public MovimientoDinero(float monto, String conceptoMovimiento, String nombreQuienModifico) {
        this.monto = monto;
        this.conceptoMovimiento = conceptoMovimiento;
        this.nombreQuienModifico = nombreQuienModifico;
    }

    public float getMonto() {
        return monto;
    }

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
