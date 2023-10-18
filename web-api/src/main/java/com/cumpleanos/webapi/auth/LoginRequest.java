/*
 * Copyright (c) 2023. Luis Chumi
 * Este programa es software libre: usted puede redistribuirlo y/o modificarlo bajo los términos de la Licencia Pública General GNU
 */

package com.cumpleanos.webapi.auth;

import lombok.Data;

@Data
public class LoginRequest {

    private String username;
    private String password;
}
