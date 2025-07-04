package com.richarddev.to_do_list.DTO;

import com.richarddev.to_do_list.Enums.PrioridadeTarefa;
import com.richarddev.to_do_list.Enums.StatusTarefa;
import com.richarddev.to_do_list.Model.Tarefa;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosTarefaUpdate(

        @NotNull Long id,
        String titulo,
        String descricao,
        StatusTarefa status,
        LocalDate prazo,
        PrioridadeTarefa prioridade) {
    
}
