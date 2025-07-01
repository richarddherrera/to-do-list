package com.richarddev.to_do_list.Model;

import com.richarddev.to_do_list.DTO.DadosTarefaCreate;
import com.richarddev.to_do_list.Enums.PrioridadeTarefa;
import com.richarddev.to_do_list.Enums.StatusTarefa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "Tarefas")
@Entity(name = "Tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    private LocalDate data_criacao;
    private LocalDate prazo;

    @Enumerated(EnumType.STRING)
    private PrioridadeTarefa prioridade;

    public Tarefa(DadosTarefaCreate dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.status = dados.status();
        this.data_criacao = LocalDate.now();
        this.prazo = dados.prazo();
        this.prioridade = dados.prioridade();
    }
}
