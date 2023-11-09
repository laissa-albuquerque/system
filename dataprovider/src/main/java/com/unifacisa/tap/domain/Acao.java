package com.unifacisa.tap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Acao {

    private UUID id;
    private String nomeAcao;
    private Double valor;
    private Double valorLote;

}
