package com.Coders.Sprint3.Entidades;

import com.Coders.Sprint3.Enums.EnumTipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "empleado")

public class Empleado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo", nullable = false)
    private String email;

    @Column(name = "empresa", nullable = false)
    private String empresaVinculada;

    @Column(name = "rol", nullable = false)
    private String rolEmpleado;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private EnumTipoUsuario tipo;

    @OneToMany(mappedBy = "empleado")
    private List<MovimientoDinero> movimientos;
    @ManyToOne
    @JoinColumn(name = "empresa_empleado")
    private Empresa empresa;

}
