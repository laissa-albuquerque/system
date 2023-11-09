package com.unifacisa.tap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private UUID id;
    private String nome;
    private Conta conta;
}
