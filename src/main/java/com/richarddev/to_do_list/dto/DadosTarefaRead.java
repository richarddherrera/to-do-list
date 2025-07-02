package com.richarddev.to_do_list.DTO;

import com.richarddev.to_do_list.Enums.PrioridadeTarefa;
import com.richarddev.to_do_list.Enums.StatusTarefa;
import com.richarddev.to_do_list.Model.Tarefa;
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

    public DadosTarefaRead(Tarefa tarefa){
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getStatus(), tarefa.getData_criacao(), tarefa.getPrazo(), tarefa.getPrioridade());
    }
}
