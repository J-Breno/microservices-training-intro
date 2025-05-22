package com.github.jbreno.pedidos.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    private UUID id = UUID.randomUUID();
    private String nome;
    private Double valor;
}
