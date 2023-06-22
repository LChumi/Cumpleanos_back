package com.cumpleanos.webapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;



@Entity
@Immutable
@Subselect("SELECT V.SECUENCIA, V.PRO_ID, V.PRO_ID1, V.CXB, V.PRO_NOMBRE, V.BOD_CODIGO, V.BOD_ID, V.BOD_NOMBRE, V.PVP, V.PVD, V.UNIDAD, V.STOCK_DISP, V.STOCK_REAL FROM INV_PRODINFGEN_WEB_V V")
@Data
public class Producto {

    @Id
    @Column(name = "SECUENCIA")
    private String secuencia;

    @Column(name = "PRO_ID")
    private String pro_id;

    @Column(name = "PRO_ID1")
    private String pro_id1;

    @Column(name = "CXB")
    private Integer cxb;

    @Column(name = "PRO_NOMBRE")
    private String pro_nombre;

    @Column(name ="BOD_CODIGO")
    private Long bod_codigo;

    @Column(name = "BOD_ID")
    private String bod_id;

    @Column(name = "BOD_NOMBRE")
    private String bod_nombre;

    @Column(name = "PVP")
    private Double pvp;

    @Column(name = "PVD")
    private Double pvd;

    @Column(name ="UNIDAD")
    private String unidad;

    @Column(name ="STOCK_DISP")
    private Integer stock_disp;

    @Column(name ="STOCK_REAL")
    private Integer stock_real;

}
