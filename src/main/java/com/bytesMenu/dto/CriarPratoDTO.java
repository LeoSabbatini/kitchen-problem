package com.bytesMenu.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;


public record CriarPratoDTO(
    @NotBlank(message = "Nome do prato é obrigatório.")
    String name,
    String description,
    @NotNull
    @Min(value = 0, message = "O valor não pode ser negativa.")
    BigDecimal price
)
{}
