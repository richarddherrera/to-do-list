package com.richarddev.to_do_list.Model;

import com.richarddev.to_do_list.DTO.DadosTarefaCreate;
import com.richarddev.to_do_list.Enums.PrioridadeTarefa;
import com.richarddev.to_do_list.Enums.StatusTarefa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

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

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    @Column(name = "data_criacao", updatable = false) // updatable para nao poder atualizar este campo
    @CreationTimestamp // Funcionar automaticamente como se fosse um LocalData.now()
    private LocalDate data_criacao;

    @Column(name = "prazo")
    private LocalDate prazo;

    @Column(name = "prioridade")
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
