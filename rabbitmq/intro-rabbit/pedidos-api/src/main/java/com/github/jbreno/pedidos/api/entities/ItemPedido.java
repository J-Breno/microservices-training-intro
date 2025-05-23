package com.github.jbreno.pedidos.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedido {
    private UUID id = UUID.randomUUID();
    private Produto produto;
    private int quantidade;
}
