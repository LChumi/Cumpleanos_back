package com.cumpleanos.webapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.util.UUID;

@Entity
@Immutable
@Subselect("SELECT BOD_USUARIO, BOD_EMPRESA, BOD_CODIGO, BOD_ID, BOD_NOMBRE FROM BODEGA_WEB_V")
@Data
public class Bodega {

    @Id
    @Column(name = "BOD_ID")
    private Long id;

    @Column(name = "BOD_USUARIO")
    private Long bod_usuario;

    @Column(name = "BOD_EMPRESA")
    private Integer bod_empresa;

    @Column(name = "BOD_CODIGO")
    private Long bod_codigo;

    @Column(name = "BOD_NOMBRE")
    private String bod_nombre;


}

