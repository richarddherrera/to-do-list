package com.richarddev.to_do_list.DTO;

import com.richarddev.to_do_list.Enums.PrioridadeTarefa;
import com.richarddev.to_do_list.Enums.StatusTarefa;
import jakarta.validation.constraints.NotNull;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public record DadosTarefaRead(

        @NotNull Long id,
        String titulo,
        String descricao,
        StatusTarefa status,
        LocalDate data_criacao,
        LocalDate prazo,
        PrioridadeTarefa prioridade) {
}
