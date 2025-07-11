package com.richarddev.to_do_list.DTO;

import com.richarddev.to_do_list.Enums.PrioridadeTarefa;
import com.richarddev.to_do_list.Enums.StatusTarefa;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosTarefaCreate(

        @NotBlank
        String titulo,

        @NotBlank
        String descricao,

        @NotNull
        StatusTarefa status,

        @NotNull
        LocalDate prazo,

        @NotNull
        PrioridadeTarefa prioridade
) {



}
