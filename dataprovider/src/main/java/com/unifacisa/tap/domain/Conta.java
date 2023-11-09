package com.unifacisa.tap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    private UUID id;
    private String numConta;
    private Double saldo;
    private Usuario usuario;
}
