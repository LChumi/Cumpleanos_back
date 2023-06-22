package com.cumpleanos.webapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "USUARIO_WEB")
@Data
public class Usuarios {

    @Id
    @Column(name = "USR_CODIGO")
    private Long usr_codigo;

    @Column(name = "USR_ID")
    private String usr_id;

    @Column(name = "USR_NOMBRE")
    private String usr_nombre;

    @Column(name = "USR_INACTIVO")
    private Integer usr_inactivo;

    @Column(name = "USR_CLAVE")
    private String usr_clave;

    @Column(name = "USR_EMPRESA_DEF")
    private Integer usr_empresa_def;

    @Column(name = "USR_ROL_WEB")
    private String usr_rol_web;
}
